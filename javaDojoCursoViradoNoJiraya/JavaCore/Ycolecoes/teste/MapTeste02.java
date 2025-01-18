package JavaCore.Ycolecoes.teste;

import JavaCore.Ycolecoes.Dominio.Comsumidor;
import JavaCore.Ycolecoes.Dominio.Manga;

import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {
        Comsumidor comsumidor1 = new Comsumidor("gabriel carvalho");
        Comsumidor comsumidor2 = new Comsumidor(" Dev dojo Academy");

        Manga manga1 = new Manga(5, "Attack on Titan ", 19.9);
        Manga manga2 = new Manga(1, "Berserk ", 9.5);
        Manga manga3 = new Manga(4, "Hellsing Ultimate", 3.2);
        Manga manga4 = new Manga(3, "pokemon", 11.20);
        Manga manga5 = new Manga(2, "dragon ball z", 2.99);

        Map<Comsumidor,Manga> comsumidorManga = new java.util.HashMap<>();
        comsumidorManga.put(comsumidor1,manga1);
        comsumidorManga.put(comsumidor2,manga4);
        for (Map.Entry<Comsumidor,Manga> entry : comsumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " comprou: " + entry.getValue().getNome());
        }
    }
}
