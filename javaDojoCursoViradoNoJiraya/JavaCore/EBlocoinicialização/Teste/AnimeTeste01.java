package JavaCore.EBlocoinicialização.Teste;

import JavaCore.EBlocoinicialização.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime =new Anime("one piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+ " ");
        }

    }
}
