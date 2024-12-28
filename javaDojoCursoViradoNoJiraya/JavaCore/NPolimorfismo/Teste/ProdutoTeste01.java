package JavaCore.NPolimorfismo.Teste;

import JavaCore.NPolimorfismo.Dominio.Computador;
import JavaCore.NPolimorfismo.Dominio.Televisão;
import JavaCore.NPolimorfismo.Dominio.Tomate;
import JavaCore.NPolimorfismo.Serviço.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC101",11109);
        Tomate tomate = new Tomate("Tomate",10);
        Televisão tv = new Televisão("Sangung 50\" ",5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
