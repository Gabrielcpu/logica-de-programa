package JavaCore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);//1.5
        List<String> nomes2 = new ArrayList<>(16);//1.5
        nomes.add("gabriel");
        nomes.add("devDojo ");
        nomes2.add("matos");
        nomes2.add("Academy");
        // System.out.println(nomes.remove("gabriel"));
        nomes.addAll(nomes2);

        for (Object nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-------------------------");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);


    }
}
