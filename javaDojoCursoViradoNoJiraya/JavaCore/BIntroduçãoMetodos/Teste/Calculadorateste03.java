package JavaCore.BIntroduçãoMetodos.Teste;

import JavaCore.BIntroduçãoMetodos.Dominio.Calculadora;

public class Calculadorateste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
      double rest = calculadora.dividiDoisNumeros(210,21);
        System.out.println(rest);
        System.out.println(calculadora.dividiDoisNumeros02(200,0));
        System.out.println("----------------");
        // classes sem retorno nao podem ser efetuadas no sout
        calculadora.imptimeDivisaoDoisNumeros(21,19);
    }

}
