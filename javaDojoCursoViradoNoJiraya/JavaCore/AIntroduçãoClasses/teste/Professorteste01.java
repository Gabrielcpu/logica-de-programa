package JavaCore.AIntroduçãoClasses.teste;

import JavaCore.AIntroduçãoClasses.Dominio.Professor;

public class Professorteste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "mestre kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("nome: "+professor.nome+" na idade: "+professor.idade+" do sexo: "+ professor.sexo);
    }
}
