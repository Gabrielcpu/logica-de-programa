package JavaCore.ZZIJDBC.teste;

import JavaCore.ZZIJDBC.Dominio.Producer;
import JavaCore.ZZIJDBC.Service.ProducerService;
import JavaCore.ZZIJDBC.conn.ConnectionFactory;
import JavaCore.ZZIJDBC.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

@Log4j2
public class ConnectionFactoryTeste01 {
    public static void main(String[] args) throws SQLException {
        Producer producer = Producer.ProducerBuilder.builder().name("Studio Deen").build();
        Producer producerTOUpdate = Producer.ProducerBuilder.builder().id(1).name("MADHOUSE").build();
        //  ProducerService.save(producer);
        // ProducerService.delete(4);
        //ProducerService.upadate(producerTOUpdate);
        //List<Producer> producers = ProducerService.findAll();
        //List<Producer> producers = ProducerService.finByName("Mad");
        //System.out.println("Producers found"+producers);
        //ProducerService.ShowProducerMetaData();
        //ProducerService.ShowDriveMetaData();
        //ProducerService.ShowTypeScrollWorking();
        //List<Producer> producers = ProducerService.finBynameAndUpperCase("Denn");
        //List<Producer> producers = ProducerService.finBynameAndInsetWhenNotFound("Bones");
        //ProducerService.finBynameAndDelete("Bones");
        //List<Producer> producers = ProducerService.finBynamePreparedStatement("Mad");
        //log.info("Producers found '{}'",producers);
        //ProducerService.UpDatePreparedStement(producerTOUpdate);
        List<Producer> producers = ProducerService.finBynameCOllableStatement("Bo");
        log.info("Producers found '{}'", producers);
    }
}
