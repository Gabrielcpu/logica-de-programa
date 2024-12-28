package JavaCore.GAssociação.Teste;

import java.util.Scanner;

public class LeituraDoTecladoExercicio {
    public static void main(String[] args) {
        Scanner jogo = new Scanner(System.in);
        System.out.println(" o grande softwer de previsão do futuro");
        System.out.println("coloque sua pergunta e eu responderei com sim ou não");
        String pergunta = jogo.nextLine();
        pergunta.charAt(0);
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
    }
}
