package JavaCore.AIntroduçãoClasses.teste;

import JavaCore.AIntroduçãoClasses.Dominio.Estudante;

public class Estudanteteste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome= "Luffy";
        estudante.idade= 21;
        estudante.sexo= 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
