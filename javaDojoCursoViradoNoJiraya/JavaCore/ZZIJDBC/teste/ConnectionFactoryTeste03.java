package JavaCore.ZZIJDBC.teste;

import JavaCore.ZZIJDBC.Dominio.Producer;
import JavaCore.ZZIJDBC.Service.ProducerService;

import java.util.List;

public class ConnectionFactoryTeste03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.ProducerBuilder.builder().name("Toei Animation").build();
        Producer producer2 = Producer.ProducerBuilder.builder().name("White fox").build();
        Producer producer3 = Producer.ProducerBuilder.builder().name("Studio Ghibli").build();
        ProducerService.saveTansaction(List.of(producer1,producer2,producer3));

    }
}
