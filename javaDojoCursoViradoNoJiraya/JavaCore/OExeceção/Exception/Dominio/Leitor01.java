package JavaCore.OExeceção.Exception.Dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor01 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("fechando leitor 1 ");
    }
}
