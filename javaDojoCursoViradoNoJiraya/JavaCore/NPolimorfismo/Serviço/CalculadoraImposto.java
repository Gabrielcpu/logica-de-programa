package JavaCore.NPolimorfismo.Serviço;

import JavaCore.NPolimorfismo.Dominio.Computador;
import JavaCore.NPolimorfismo.Dominio.Produto;
import JavaCore.NPolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {

    public  static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto ");
        double imposto = produto.CalcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: "+ produto.getValor());
        System.out.println("imposto a pagar: "+ imposto);
        if (produto instanceof Tomate){
        Tomate tomate = (Tomate) produto;
        System.out.println(tomate.getDataDeValidade());}
    }
}

