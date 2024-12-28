package JavaCore.OExeceção.Exception.Teste;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

public class Exceptionteste02 {
    public static void main(String[] args)throws  IOException {
        criarNovoarquivo();
    }

    private static void criarNovoarquivo()throws IOException {
        File file = new File("Arquivo\\ teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema na hora de criar o arquivo");
        }
    }
}
