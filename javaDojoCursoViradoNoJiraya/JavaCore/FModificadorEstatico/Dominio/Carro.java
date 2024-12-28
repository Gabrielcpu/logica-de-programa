package JavaCore.FModificadorEstatico.Dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velociadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime (){
        System.out.println("----------------");
        System.out.println("nome "+this.nome);
        System.out.println("velocidade Maxima "+this.velocidadeMaxima);
        System.out.println("velociade Limite "+Carro.velociadeLimite);
    }

    public static void setVelociadeLimite(double velociadeLimite){
        Carro.velociadeLimite = velociadeLimite;
    }
    public static double getVelociadeLimite(){
        return Carro.velociadeLimite;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
