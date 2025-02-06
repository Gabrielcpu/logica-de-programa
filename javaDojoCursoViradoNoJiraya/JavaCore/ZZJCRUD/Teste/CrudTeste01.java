package JavaCore.ZZJCRUD.Teste;

import JavaCore.ZZJCRUD.Servico.ProducerService;

import java.util.Scanner;

public class CrudTeste01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            producerMenu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            ProducerService.Menu(op);

        }
    }

    private static void producerMenu() {
        System.out.println("Type the number of your operantion");
        System.out.println("1. search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");
        System.out.println("0. Exit");
    }
}
