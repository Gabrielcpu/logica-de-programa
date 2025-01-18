package JavaCore.Ycolecoes.teste;

import JavaCore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteradorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Attack on Titan ", 19.9,0));
        mangas.add(new Manga(1L, "Berserk ", 9.5,5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2,0));
        mangas.add(new Manga(3L, "pokemon", 11.20,2));
        mangas.add(new Manga(2L, "dragon ball z", 2.99,0));

        Iterator<Manga> iterator = mangas.iterator();
        while (iterator.hasNext()) {
            Manga manga = iterator.next();
            if (manga.getQuantidade()==0){
                iterator.remove();
            }
        }
        System.out.println(mangas);
        mangas.removeIf(manga -> manga.getQuantidade()==0);
        System.out.println(mangas);

    }
}
