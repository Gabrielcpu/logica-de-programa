package JavaCore.GAssociação.Teste;

import JavaCore.GAssociação.Dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pelé");
        Jogador jogador2 = new Jogador("Cafú");
        Jogador jogador3 = new Jogador("Neymar");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};
        for (Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
