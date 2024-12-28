package JavaCore.OExeceção.Exception.Teste;

import JavaCore.OExeceção.Exception.Dominio.LoginInvalidoExeption;

import java.util.Scanner;

public class LoginInvalidoTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoExeption e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoExeption {
        Scanner teclado = new Scanner(System.in);
        String userNameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("usuario");
        String userNomeDigitado = teclado.nextLine();
        System.out.println("senha");
        String SenhaDigitada = teclado.nextLine();
        if (!userNameDB.equals(userNomeDigitado) || !senhaDB.equals(SenhaDigitada)) {
            throw new LoginInvalidoExeption("usuario ou senha invalida");
        }
        System.out.println("usuario logado com sucesso");
    }
}
