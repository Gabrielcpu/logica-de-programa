package JavaCore.Teste;

import java.io.*;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file= new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("o devDojo é lindo, é o melhor curso do brasil");
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
