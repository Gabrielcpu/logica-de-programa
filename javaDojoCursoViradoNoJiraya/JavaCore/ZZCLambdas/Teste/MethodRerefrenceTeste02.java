package JavaCore.ZZCLambdas.Teste;

import JavaCore.ZZCLambdas.Dominio.Anime;
import JavaCore.ZZCLambdas.Service.AnimeComparators;

import java.util.List;

//reference to on instance method of a partivular object
public class MethodRerefrenceTeste02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new java.util.ArrayList<>(List.of(new Anime(45, "bersek"), new Anime(900, "One piece"), new Anime(500, "naruto")));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
