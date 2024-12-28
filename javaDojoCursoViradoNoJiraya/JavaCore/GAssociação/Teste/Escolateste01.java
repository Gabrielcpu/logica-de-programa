package JavaCore.GAssociação.Teste;

import JavaCore.GAssociação.Dominio.Escola;
import JavaCore.GAssociação.Dominio.Professor;

public class Escolateste01 {
    public static void main(String[] args) {
        Professor profesor01 = new Professor("jiraya sensei");
        Professor profesor02 = new Professor("kakashi sensei");
        Professor[] professores = {profesor01,profesor02};
        Escola escola = new Escola("Escola: konoha", professores);
        escola.imprime();
    }
}
