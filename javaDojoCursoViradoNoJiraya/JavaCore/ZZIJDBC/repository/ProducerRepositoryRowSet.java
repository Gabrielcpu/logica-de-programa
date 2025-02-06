package JavaCore.ZZIJDBC.repository;

import JavaCore.ZZIJDBC.Dominio.Producer;
import JavaCore.ZZIJDBC.Listener.CustomRowSetListener;
import JavaCore.ZZIJDBC.conn.ConnectionFactory;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM anime_store.producer where producercol like ?;";
        List<Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();
            while (jrs.next()) {
                Producer producer = Producer
                        .ProducerBuilder.builder()
                        .id(jrs.getInt("idproducer"))
                        .name(jrs.getString("producercol"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }
    /*public static void UpdateJdbcRowSet(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `producercol` = ? WHERE (`idproducer` = ?);";
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.setCommand(sql);
            jrs.setString(1,producer.getName());
            jrs.setInt(1,producer.getId());
            jrs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

    public static void UpdateJdbcRowSet(Producer producer) {
        String sql = "SELECT * FROM anime_store.producer WHERE (`idproducer` = ?);";
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if (!jrs.next()) return;
            jrs.updateString("producercol", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void UpdateCachedRowSet(Producer producer) {
        String sql = "SELECT * FROM producer WHERE (`idproducer` = ?);";
        try (CachedRowSet crs = ConnectionFactory.getCacheRowSet();
        Connection connection = ConnectionFactory.getConnection()){
            connection.setAutoCommit(false);
            crs.addRowSetListener(new CustomRowSetListener());
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection);
            if (!crs.next()) return;
            crs.updateString("producercol", producer.getName());
            crs.updateRow();
            TimeUnit.SECONDS.sleep(10);
            crs.acceptChanges();
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        }

    }


}
