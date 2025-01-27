package JavaCore.ZZDoptional.Teste;

import JavaCore.ZZDoptional.Dominio.Manga;
import JavaCore.ZZDoptional.Repositorio.MangaRepositorio;

import java.util.Optional;

public class OptinalTeste02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepositorio.finByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepositorio.finByid(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepositorio.finByTitle("Drifters")
                .orElseGet(() -> new Manga(20, 3, "Drifters"));
        System.out.println(newManga);


    }
}
