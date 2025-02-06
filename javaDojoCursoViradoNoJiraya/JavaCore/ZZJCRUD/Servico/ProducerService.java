package JavaCore.ZZJCRUD.Servico;


import JavaCore.ZZJCRUD.Dominio.Producer;
import JavaCore.ZZJCRUD.Repository.ProducerRepository;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void Menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }



    private static void findByName() {
        System.out.println("Type the name or empy to all");
        String name = SCANNER.nextLine();
        ProducerRepository.finBynamePreparedStatement(name)
                .forEach(p -> System.out.printf("[%d] -%s%n", p.getId(), p.getName()));

    }

    private static void delete() {
        System.out.println("Type one of the producer you want to delete ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }
    private static void save() {
        System.out.println("Type the name of the producer ");
        String name = SCANNER.nextLine();
        Producer producer = Producer.ProducerBuilder.builder().name(name).build();
        ProducerRepository.Save(producer);
    }
    private static void update() {
        System.out.println("Type the id of the object you want to update ");
        Optional<Producer> producerOptional = ProducerRepository.finByID(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()){
            System.out.println("Producer not found");
            return;
        }
        Producer producer = producerOptional.get();
        System.out.println("Producer found"+producer);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name= name.isEmpty() ? producer.getName() : name;

        Producer producerToUpdate = Producer.ProducerBuilder.builder()
                .id(producer.getId())
                .name(name)
                .build();
        ProducerRepository.UpDate(producerToUpdate);
    }
}
