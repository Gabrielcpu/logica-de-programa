package JavaCore.BIntroduçãoMetodos.Teste;

import JavaCore.BIntroduçãoMetodos.Dominio.Pessoa;

public class Pessoateste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
       // pessoa.nome = "jiraya";
        pessoa.setNome("Jiraya");
       // pessoa.idade = 70;
        pessoa.setIdade(70);
        pessoa.Imprime();
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
