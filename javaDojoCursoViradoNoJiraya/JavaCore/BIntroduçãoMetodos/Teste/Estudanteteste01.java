package JavaCore.BIntroduçãoMetodos.Teste;

import JavaCore.BIntroduçãoMetodos.Dominio.Estudante;
import JavaCore.BIntroduçãoMetodos.Dominio.ImpressoraEstudante;

public class Estudanteteste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "Midorya ";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("_________________________________");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
