package JavaCore.BIntroduçãoMetodos.Dominio;

public class Calculadora {
    public void somaDeDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subitraiDoisNumeros() {
        System.out.println(21 - 43);
    }

    public void mutiplicaDoisParametros(int num01, int num02) {
        System.out.println(num01 * num02);
    }

    public double dividiDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double dividiDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imptimeDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println(" na Alteracçao dos numeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);

    }

    public void SomaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void SomaVarargs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
