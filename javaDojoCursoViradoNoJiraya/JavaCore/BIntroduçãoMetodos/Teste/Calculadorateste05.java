package JavaCore.BIntroduçãoMetodos.Teste;

import JavaCore.BIntroduçãoMetodos.Dominio.Calculadora;

public class Calculadorateste05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3,4,5};
        calculadora.SomaArray(numeros);
        calculadora.SomaVarargs(1,2,3,4,5,6,7);
    }
}
