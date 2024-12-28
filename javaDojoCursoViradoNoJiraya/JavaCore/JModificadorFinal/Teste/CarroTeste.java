package JavaCore.JModificadorFinal.Teste;

import JavaCore.JModificadorFinal.Dominio.Carro;
import JavaCore.JModificadorFinal.Dominio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("bololo");
        ferrari.imprime();
    }
}
