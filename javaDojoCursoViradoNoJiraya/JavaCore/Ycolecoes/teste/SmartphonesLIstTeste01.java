package JavaCore.Ycolecoes.teste;

import JavaCore.Ycolecoes.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphonesLIstTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("22222", "pixel");
        Smartphone s3 = new Smartphone("33333", "sansumg");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222", "pixel");

        System.out.println(smartphones.contains(s4));
        int indexsmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexsmartphone4));
    }
}
