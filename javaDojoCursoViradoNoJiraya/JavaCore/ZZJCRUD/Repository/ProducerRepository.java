package JavaCore.ZZJCRUD.Repository;


import JavaCore.ZZJCRUD.Conn.ConnectionFactory;
import JavaCore.ZZJCRUD.Dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static List<Producer> finBynamePreparedStatement(String name) {
        log.info("Finding all producers", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
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

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where producercol like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Producer> finByID(Integer id) {
        log.info("Finding all producers", id);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByID(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            return Optional.of(Producer
                    .ProducerBuilder.builder()
                    .id(rs.getInt("idproducer"))
                    .name(rs.getString("producercol"))
                    .build());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindByID(Connection conn, Integer Id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where idproducer = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, Id);
        return ps;
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`idproducer` = '?');";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id)) {
            ps.execute();
            log.info("Delete producer '{}' from the database,rows affected'{}'", id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where producercol like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void Save(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = CreatePrepareStatementeSave(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement CreatePrepareStatementeSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`producercol`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;

    }
    public static void UpDate(Producer producer) {
        log.info("Updaling producer'{}'",producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createprepareStatementeUpdade(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Upadate producer'{}',rows affected '{}' ", producer.getId(), rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement createprepareStatementeUpdade(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `producercol` = ? WHERE (`idproducer` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;

    }
}
