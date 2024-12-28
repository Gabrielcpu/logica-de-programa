package JavaCore.OExeceção.Exception.Teste;

import java.io.File;
import java.io.IOException;

public class Exceptionteste01 {
    public static void main(String[] args) {
 criarNovoarquivo();
    }

    private static void criarNovoarquivo() {
        File file = new File("Arquivo\\ teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
