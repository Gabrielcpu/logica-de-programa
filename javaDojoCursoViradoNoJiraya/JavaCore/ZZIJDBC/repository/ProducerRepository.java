package JavaCore.ZZIJDBC.repository;

import JavaCore.ZZIJDBC.Dominio.Producer;
import JavaCore.ZZIJDBC.conn.ConnectionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProducerRepository {
    private static final Logger log = LogManager.getLogger(ProducerRepository.class);

    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`producercol`) VALUES ('Studio Deen');";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Database rows affected{}", rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void saveTansaction(List<Producer> producers) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            conn.setAutoCommit(false);
            PreparedStatementsaveTransaction(conn, producers);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void PreparedStatementsaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`producercol`) VALUES ( ? );";
        boolean shouldRollback = false;
        for (Producer p : producers) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                log.info("Saving producer'{}'", p.getName());
                ps.setString(1, p.getName());
               // if (p.getName().equals("white fox")) throw new SQLException("can´t save white fox");
                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                shouldRollback = true;
            }
        }
        if (shouldRollback) {
            log.warn("Transaction ir roll back");
            conn.rollback();
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`idproducer` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Delete producer '{}' from the database,rows affected'{}'", id, rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void UpDate(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `producercol` = '%s' WHERE (`idproducer` = '%d');\n"
                .formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Upadate producer'{}',rows affected '{}' ", producer.getId(), rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void UpDatePreparedStement(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = PreparedStatementUpdade(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Upadate producer'{}',rows affected '{}' ", producer.getId(), rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement PreparedStatementUpdade(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `producercol` = ? WHERE (`idproducer` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;

    }

    public static List<Producer> finALL() {
        log.info("Finding all producers");
        return finByname("");

    }

    public static List<Producer> finByname(String name) {
        log.info("Finding all producers");
        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer
                        .ProducerBuilder.builder()
                        .id(rs.getInt("idproducer"))
                        .name(rs.getString("producercol"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }

    public static List<Producer> finBynamePreparedStatement(String name) {
        log.info("Finding all producers");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = PreparedStatementFinBtName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer
                        .ProducerBuilder.builder()
                        .id(rs.getInt("idproducer"))
                        .name(rs.getString("producercol"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }

    public static List<Producer> finBynameCOllableStatement(String name) {
        log.info("Finding all producers");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = CollablePreparedStatement(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer
                        .ProducerBuilder.builder()
                        .id(rs.getInt("idproducer"))
                        .name(rs.getString("producercol"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }

    private static CallableStatement CollablePreparedStatement(Connection conn, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name`('NHK');";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, name);
        return cs;

    }

    private static PreparedStatement PreparedStatementFinBtName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where producercol like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        return ps;

    }

    public static void ShowProducerMetaData() {
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            rs.next();
            int columnCount = rsMetaData.getColumnCount();
            System.out.printf("Columns count '{}'", columnCount);
            for (int i = 1; i < columnCount; i++) {
                System.out.printf("table name'{}'", rsMetaData.getTableName(i));
                System.out.printf("Collun name'{}'", rsMetaData.getColumnName(i));
                System.out.printf("Collun size'{}'", rsMetaData.getColumnDisplaySize(i));
                System.out.printf("Collun type'{}'", rsMetaData.getColumnType(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void ShowDriveMetaData() {
        log.info(" ");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("SUpports type TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("Suportou concur updatable");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("SUpports type TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("Suportou concur updatable");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("SUpports type TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("Suportou concur updatable");
                }
            }
        } catch (SQLException e) {
            log.error(e);
        }

    }

    public static void ShowTypeScrollWorking() {
        log.info("Finding all producers");
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            log.info("Last row? '{}'", rs.last());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).name(rs.getString("producercol")).build());

            log.info("Last row? '{}'", rs.last());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).name(rs.getString("producercol")).build());

            log.info("Last absolute? '{}'", rs.absolute(2));
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).name(rs.getString("producercol")).build());

            log.info("Last relative? '{}'", rs.relative(-1));
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).name(rs.getString("producercol")).build());

            log.info("Last isLast? '{}'", rs.isLast());
            log.info("Row number '{}'", rs.getRow());

            log.info("Last isFirst? '{}'", rs.isFirst());
            log.info("Row number '{}'", rs.getRow());

            log.info("Last row? '{}'", rs.isLast());
            log.info("__________________");
            rs.next();
            log.info("after last row? '{}'", rs.isAfterLast());
            while (rs.previous()) {
                log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).name(rs.getString("producercol")).build());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Producer> finBynameAndUpperCase(String name) {
        log.info("Finding all producers");
        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("producercol", rs.getString("producercol").toUpperCase());
                // rs.cancelRowUpdates();
                rs.updateRow();
                Producer producer = Producer
                        .ProducerBuilder.builder()
                        .id(rs.getInt("idproducer"))
                        .name(rs.getString("producercol"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;

    }

    public static List<Producer> finBynameAndInsetWhenNotFound(String name) {
        log.info("Finding all producers");
        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            if (rs.next()) return producers;

            rs.moveToInsertRow();
            rs.updateString("producercol", name);
            rs.insertRow();
            rs.beforeFirst();
            Producer producer = Producer
                    .ProducerBuilder.builder()
                    .id(rs.getInt("idproducer"))
                    .name(rs.getString("producercol"))
                    .build();
            producers.add(producer);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }

    public static void finBynameAndDelete(String name) {
        log.info("Finding all producers");
        String sql = "SELECT * FROM anime_store.producer where producercol like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("delete '{}", rs.getString("producercol"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
