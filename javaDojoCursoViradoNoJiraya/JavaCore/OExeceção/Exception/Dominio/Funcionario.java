package JavaCore.OExeceção.Exception.Dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoExeption , FileNotFoundException{
        System.out.println("salvando funcionario");
    }
}
