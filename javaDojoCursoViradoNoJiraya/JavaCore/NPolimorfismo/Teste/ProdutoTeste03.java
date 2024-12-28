package JavaCore.NPolimorfismo.Teste;

import JavaCore.NPolimorfismo.Dominio.Computador;
import JavaCore.NPolimorfismo.Dominio.Produto;
import JavaCore.NPolimorfismo.Dominio.Tomate;
import JavaCore.NPolimorfismo.Serviço.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Rynz 9", 3000);

        Tomate tomate = new Tomate("americano", 20);
        tomate.setDataDeValidade("01/12/2025");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
