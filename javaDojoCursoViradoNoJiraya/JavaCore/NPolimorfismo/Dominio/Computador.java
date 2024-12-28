package JavaCore.NPolimorfismo.Dominio;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalcularImposto() {
        System.out.println("calculando imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
