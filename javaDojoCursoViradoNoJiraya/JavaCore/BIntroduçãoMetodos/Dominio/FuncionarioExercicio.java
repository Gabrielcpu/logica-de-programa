package JavaCore.BIntroduçãoMetodos.Dominio;

public class FuncionarioExercicio {
    private String nome = null;
    private int idade = 0;
    private double[] salarios = null;
    private double soma = 0;

    public FuncionarioExercicio(String nome, int idade, double[] salarios) {
        this.nome = "kirito";
        this.idade = 21;
        this.salarios = salarios;
    }

    public void ImprimirDados() {
        System.out.println("nome " + nome);
        System.out.println("idade " + idade);
        System.out.println("salarios ");
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
        }
        System.out.println();
        calcularMediaSalario();
    }

    public void calcularMediaSalario() {
        if (salarios!= null) {
            for (double salario : salarios) {
                soma += salario;
            }
            double media = soma / salarios.length;
            System.out.println("a soma dos salarios é " + media);
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getSoma() {
        return soma;
    }
}

