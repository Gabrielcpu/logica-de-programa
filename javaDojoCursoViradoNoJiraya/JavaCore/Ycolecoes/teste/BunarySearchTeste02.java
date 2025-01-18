package JavaCore.Ycolecoes.teste;

import JavaCore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BunarySearchTeste02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5, "Attack on Titan ", 19.9));
        mangas.add(new Manga(1, "Berserk ", 9.5));
        mangas.add(new Manga(4, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3, "pokemon", 11.20));
        mangas.add(new Manga(2, "dragon ball z", 2.99));
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println(Collections.binarySearch(mangas, new Manga(3, "pokemon", 11.20)));
    }
}
