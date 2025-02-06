package JavaCore.ZZIJDBC.Service;

import JavaCore.ZZIJDBC.Dominio.Producer;
import JavaCore.ZZIJDBC.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);

    }
    public static void saveTansaction(List<Producer> producers) {
    ProducerRepository.saveTansaction(producers);
    }
    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void upadate(Producer producer) {
        requireValidId(producer.getId());
       ProducerRepository.UpDate(producer);
    }
    public static void UpDatePreparedStement(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.UpDatePreparedStement(producer);
    }



    public static List<Producer> findAll() {
       return ProducerRepository.finALL();
    }

    public static List<Producer> finByName(String name) {
        return ProducerRepository.finByname(name);
    }
    public static List<Producer> finBynamePreparedStatement(String name) {
        return ProducerRepository.finBynamePreparedStatement(name);
    }
    public static List<Producer> finBynameCOllableStatement(String name) {
        return ProducerRepository.finBynameCOllableStatement(name);
    }

    public static void ShowProducerMetaData() {
        ProducerRepository.ShowProducerMetaData();
    }

    public static void ShowDriveMetaData() {
        ProducerRepository.ShowDriveMetaData();
    }
    public static void ShowTypeScrollWorking() {
        ProducerRepository.ShowTypeScrollWorking();
    }

    private static void requireValidId(Integer id) {
        if (id == null && id <= 0) {
            throw new IllegalArgumentException("invalid value for id");
        }
    }
    public static List<Producer> finBynameAndUpperCase(String name) {
        return ProducerRepository.finBynameAndUpperCase(name);
    }

    public static List<Producer> finBynameAndInsetWhenNotFound(String name) {
        return ProducerRepository.finBynameAndInsetWhenNotFound(name);
    }

    public static void finBynameAndDelete(String name) {
        ProducerRepository.finBynameAndDelete(name);
    }
}
