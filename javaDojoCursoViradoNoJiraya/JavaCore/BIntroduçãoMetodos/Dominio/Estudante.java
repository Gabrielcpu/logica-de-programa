package JavaCore.BIntroduçãoMetodos.Dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
// tomar cuidado para não ter uma baixa coesão
    public void imprima (){
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
