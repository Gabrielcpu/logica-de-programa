package JavaCore.ZGenerics.Teste;


import java.util.ArrayList;
import java.util.List;

public class wildCardTEste02 {
    public static void main(String[] args) {
        List<Animal> cachorro = List.of(new Cachorro(), new Cachorro());
        List<Gato> gato = List.of(new Gato(), new Gato());
        printConsulta(cachorro);
        printConsulta(gato);
        List<Animal> animais = new ArrayList<>();
        printConsulta(animais);
        printConsultaAnimal(cachorro);
    }

    //Type erasure ?
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal1 : animals) {
            animal1.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals) {
animals.add(new Cachorro());
animals.add(new Gato());
    }
}
