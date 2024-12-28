package JavaCore.OExeceção.Exception.Teste;

import JavaCore.OExeceção.Exception.Dominio.Funcionario;
import JavaCore.OExeceção.Exception.Dominio.LoginInvalidoExeption;
import JavaCore.OExeceção.Exception.Dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreescritaComExceptionTEste01 {
    public static void main(String[] args) {
        Pessoa pessoa= new Pessoa();
        Funcionario funcionario =new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoExeption | FileNotFoundException  e) {
            throw new RuntimeException(e);
        }
    }
}
