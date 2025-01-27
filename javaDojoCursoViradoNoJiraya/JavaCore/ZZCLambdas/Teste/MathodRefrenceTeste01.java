package JavaCore.ZZCLambdas.Teste;

import JavaCore.ZZCLambdas.Dominio.Anime;
import JavaCore.ZZCLambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//refrence to a static method
public class MathodRefrenceTeste01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime(45, "bersek"), new Anime(900, "One piece"), new Anime(500, "naruto")));
        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
