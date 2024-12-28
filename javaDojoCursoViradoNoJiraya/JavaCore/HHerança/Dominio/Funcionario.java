package JavaCore.HHerança.Dominio;

public class Funcionario extends Pessoa{
    private double Salario;

     public Funcionario(String nome){
         super(nome);
     }
    public void imprime(){
        super.imprime();
        System.out.println(this.Salario);
    }
    public void relatorioPagamento(){
        System.out.println("Eu"+ this.nome+ "recebi o salario de "+this.Salario );
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
