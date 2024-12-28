package introdução;

public class javadojooperadores {
    public static void main(String[] args) {
        // + - / *

        int numero01 = 10 ;
        int numero02 = 20;
        double soma = numero01 / (double) numero02;
        System.out.println(soma);

       // resto = %

        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteQueDez = 10 != 10;

        System.out.println("is Dez Menor Que Vinte "+ isDezMenorQueVinte);
        System.out.println("is Dez Maior Que Vinte "+isDezMaiorQueVinte );
        System.out.println("is DezI gual Que Vinte "+ isDezIgualQueVinte);
        System.out.println("is Dez Igual Que Dez "+ isDezIgualQueDez);
        System.out.println("is DezI Diferente Que Dez "+ isDezDiferenteQueDez);

        // && (e, end) || (ou , or) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("is Dentro Da Lei Maior Que Trinta /"+isDentroDaLeiMaiorQueTrinta);
        System.out.println("is Dentro Da Lei Menor Que Trinta /"+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorTotalPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorTotalPlaystation || valorTotalContaPoupança > valorTotalPlaystation;
        System.out.println("valor Total Playstation /"+isPlaystationCincoCompravel);

        // = += -= /= *= %=
        double bonus =1000; //bonus = 1000
        bonus += 1000; //bonus = 2000
        bonus -= 1000; //bons = 00
        bonus *= 2; // bonus = x2 ou 2000
        bonus /= 2; // bonus = dividido 2 ou 1000
        bonus %= 2; // bonus = resto dividido 2 ou 0.0
        System.out.println(bonus);

        // ++ --

        double contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);

    }
}
