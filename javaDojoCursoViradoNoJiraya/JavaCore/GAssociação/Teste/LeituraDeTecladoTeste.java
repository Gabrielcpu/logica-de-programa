package JavaCore.GAssociação.Teste;

import java.util.Scanner;

public class LeituraDeTecladoTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       System.out.println("Digite Seu nome a abixo");
        String nome = teclado.nextLine();
        System.out.println(nome);
        System.out.println("digite sua idade");
       int idade = teclado.nextInt();
        System.out.println("digite o seu sexo M ou F");
       char sexo = teclado.next().charAt(0);
        System.out.println("------------------");
        System.out.println("nome:"+ nome);
        System.out.println("idade:"+ idade);
        System.out.println("sexo:"+ sexo);

    }
}
