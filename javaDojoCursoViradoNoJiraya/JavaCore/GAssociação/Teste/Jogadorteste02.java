package JavaCore.GAssociação.Teste;

import JavaCore.GAssociação.Dominio.Jogador;
import JavaCore.GAssociação.Dominio.Time;

public class Jogadorteste02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("pelé");
        Time time = new Time("seleção brasileira");
        jogador01.setTime(time);
        jogador01.imprime();
    }
}
