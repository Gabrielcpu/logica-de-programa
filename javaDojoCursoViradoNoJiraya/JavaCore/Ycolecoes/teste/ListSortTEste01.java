package JavaCore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTEste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan ");
        mangas.add("Berserk ");
        mangas.add("Hellsing Ultimate");
        mangas.add("pokemon");
        mangas.add("dragon ball z");

        Collections.sort(mangas);
        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(21.98);
        dinheiros.add(21.21);
        dinheiros.add(95.21);


        for (String manga : mangas){
            System.out.println(manga);
        }

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
