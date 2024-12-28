package JavaCore.NPolimorfismo.Dominio;

public class Televisão extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Televisão(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalcularImposto() {
        System.out.println("calculando imposto da televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
