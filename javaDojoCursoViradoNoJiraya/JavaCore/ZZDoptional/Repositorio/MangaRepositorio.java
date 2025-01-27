package JavaCore.ZZDoptional.Repositorio;

import JavaCore.ZZDoptional.Dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {
    private static List<Manga> mangas = List.of(new Manga(50, 1, "Boku no hero"), new Manga(25, 2, "Overlord"));

    public static Optional<Manga> finByTitle(String title) {
   return findBy(manga -> manga.getTitle().equals(title));
    }

    public static Optional<Manga> finByid(Integer id) {
        return findBy(manga -> manga.getId().equals(id));

    }
    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
