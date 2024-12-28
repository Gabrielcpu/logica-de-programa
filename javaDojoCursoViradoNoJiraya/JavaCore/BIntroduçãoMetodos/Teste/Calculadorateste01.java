package JavaCore.BIntroduçãoMetodos.Teste;

import JavaCore.BIntroduçãoMetodos.Dominio.Calculadora;

public class Calculadorateste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDeDoisNumeros();
        System.out.println("finalizando Calculadorteste01");
        System.out.println("-----------------");
        calculadora.subitraiDoisNumeros();
        System.out.println("finalizando a subitração");
    }
}
