package JavaCore.ZGenerics.Dominio;

public class Carro {
    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CArro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
