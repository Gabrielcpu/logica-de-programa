package JavaCore.ZZIJDBC.teste;

import JavaCore.ZZIJDBC.Dominio.Producer;
import JavaCore.ZZIJDBC.Service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryteste02 {
    public static void main(String[] args) {
        Producer producerTOUpdate = Producer.ProducerBuilder.builder().id(1).name("MADHOUSE").build();
        ProducerServiceRowSet.UpdateCachedRowSet(producerTOUpdate);
       /* System.out.println("__________________");
        List<Producer> pro = ProducerServiceRowSet.findByNameJdbcRowSet("NHK");
        log.info(pro);*/
    }
}
