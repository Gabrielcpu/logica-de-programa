package JavaCore.ZGenerics.Teste;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consulta do cachorro");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consulta do gato");
    }
}

public class wildCardTEste01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
        Animal[] animais = {new Gato(), new Cachorro()};
        printConsulta(animais);
    }

    private static void printConsulta(Animal[] animal) {
        for (Animal animal1 : animal) {
            animal1.consulta();
        }
    }
}
