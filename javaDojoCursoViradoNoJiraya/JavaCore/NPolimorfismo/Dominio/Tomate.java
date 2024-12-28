package JavaCore.NPolimorfismo.Dominio;

public class Tomate extends  Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

  private String DataDeValidade;

    @Override
    public double CalcularImposto() {
        System.out.println("calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return DataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        DataDeValidade = dataDeValidade;
    }
}
