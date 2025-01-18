package JavaCore.Ycolecoes.teste;

import JavaCore.Ycolecoes.Dominio.Manga;
import JavaCore.Ycolecoes.Dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
class SmarthephoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangasPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthephoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);
        System.out.println("---------------");
        NavigableSet<Manga> mangas = new TreeSet<>(new MangasPrecoComparator());
        mangas.add(new Manga(5L, "Attack on Titan ", 19.9));
        mangas.add(new Manga(1L, "Berserk ", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L, "pokemon", 11.20));
        mangas.add(new Manga(2L, "dragon ball z", 2.99));
        mangas.add(new Manga(10L, "Aaragon", 2.99));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga yuyu = new Manga(21L, "Yuyu hakusho ", 3.2,5);
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println("------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
    }
}
