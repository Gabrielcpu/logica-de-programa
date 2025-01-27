package JavaCore.ZZCLambdas.Teste;

import JavaCore.ZZCLambdas.Dominio.Anime;
import JavaCore.ZZCLambdas.Service.AnimeComparators;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

//Reference to o constructor
public class MethodReferenceTeste04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new java.util.ArrayList<>(List.of(new Anime(45, "bersek"), new Anime(900, "One piece"), new Anime(500, "naruto")));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer ,Anime> animeBiFunction = (title, episodes ) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super campeões", 36));
    }
}
