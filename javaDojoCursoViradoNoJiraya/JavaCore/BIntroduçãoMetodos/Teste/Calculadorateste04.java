package JavaCore.BIntroduçãoMetodos.Teste;

import JavaCore.BIntroduçãoMetodos.Dominio.Calculadora;

public class Calculadorateste04 {
    public static void main(String[] args) {
        Calculadora calculadora =new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println(" dentro de Calculadorateste04");
        System.out.println("num1 "+ num1);
        System.out.println("num2 "+ num2);
    }
}
