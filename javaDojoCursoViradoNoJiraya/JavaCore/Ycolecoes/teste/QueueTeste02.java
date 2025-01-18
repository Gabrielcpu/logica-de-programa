package JavaCore.Ycolecoes.teste;

import JavaCore.Ycolecoes.Dominio.Comsumidor;
import JavaCore.Ycolecoes.Dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangasPrecoComparator().reversed());
        mangas.add(new Manga(5, "Attack on Titan ", 19.9));
        mangas.add(new Manga(1, "Berserk ", 9.5));
        mangas.add(new Manga(4, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3, "pokemon", 11.20));
        mangas.add(new Manga(2, "dragon ball z", 2.99));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
