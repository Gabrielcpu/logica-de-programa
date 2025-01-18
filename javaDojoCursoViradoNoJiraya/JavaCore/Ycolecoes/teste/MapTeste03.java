package JavaCore.Ycolecoes.teste;

import JavaCore.Ycolecoes.Dominio.Comsumidor;
import JavaCore.Ycolecoes.Dominio.Manga;

import java.util.List;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Comsumidor comsumidor1 = new Comsumidor("gabriel carvalho");
        Comsumidor comsumidor2 = new Comsumidor(" Dev dojo Academy");

        Manga manga1 = new Manga(5, "Attack on Titan ", 19.9);
        Manga manga2 = new Manga(1, "Berserk ", 9.5);
        Manga manga3 = new Manga(4, "Hellsing Ultimate", 3.2);
        Manga manga4 = new Manga(3, "pokemon", 11.20);
        Manga manga5 = new Manga(2, "dragon ball z", 2.99);

        List<Manga> mangasConsumorListe = List.of(manga1, manga2, manga3);
        List<Manga> mangasConsumor2Liste = List.of(manga4, manga5);
        Map<Comsumidor, List<Manga>> comsumidorMangaMap = new java.util.HashMap<>();
        comsumidorMangaMap.put(comsumidor1, mangasConsumorListe);
        comsumidorMangaMap.put(comsumidor2, mangasConsumor2Liste);

        for (Map.Entry<Comsumidor, List<Manga>> entry : comsumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " comprou: ");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
        }


    }
}
