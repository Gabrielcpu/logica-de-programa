package JavaCore.NPolimorfismo.Teste;

import JavaCore.NPolimorfismo.Dominio.Computador;
import JavaCore.NPolimorfismo.Dominio.Produto;
import JavaCore.NPolimorfismo.Dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador ("Rynz 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.CalcularImposto());

        System.out.println("----------------");

        Produto produto2 = new Tomate("intel i9", 5000);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.CalcularImposto());
    }
}
