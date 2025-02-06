package JavaCore.ZZIJDBC.Service;

import JavaCore.ZZIJDBC.Dominio.Producer;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerServiceRowSet.findByNameJdbcRowSet(name);
    }
    public static void UpdateJdbcRowSet(Producer producer) {
    ProducerServiceRowSet.UpdateJdbcRowSet(producer);
    }
    public static void UpdateCachedRowSet(Producer producer) {
    ProducerServiceRowSet.UpdateCachedRowSet(producer);
    }
}
