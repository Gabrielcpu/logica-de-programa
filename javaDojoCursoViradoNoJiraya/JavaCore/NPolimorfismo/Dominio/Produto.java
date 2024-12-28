package JavaCore.NPolimorfismo.Dominio;

public abstract class Produto implements Taxado {
    protected String nome;
    protected   double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double CalcularImposto() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
