package JavaCore.Ycolecoes.teste;

import JavaCore.Ycolecoes.Dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTEste01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5, "Attack on Titan ", 19.9));
        mangas.add(new Manga(1, "Berserk ", 9.5));
        mangas.add(new Manga(4, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3, "pokemon", 11.20));
        mangas.add(new Manga(2, "dragon ball z", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
