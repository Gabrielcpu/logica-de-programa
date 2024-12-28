package JavaCore.OExeceção.Exception.Dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar () throws LoginInvalidoExeption, FileNotFoundException {
        System.out.println("salvando pessoa");
    }
}
