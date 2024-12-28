package JavaCore.GAssociação.Teste;

import JavaCore.GAssociação.Dominio.Jogador;
import JavaCore.GAssociação.Dominio.Time;

public class Jogadorteste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("kaka");
        Time time = new Time("Brasil");
        Jogador[] jogadores = { jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador");
        jogador.imprime();
        System.out.println("--- Time");
        time.imprieme();
    }
}
