package JavaCore.Teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Fiel
//Filewriter
//FileReader
//BufferedWriter
// BufferedReader
public class FIleWriterTete01 {
    public static void main(String[] args) {
        File file= new File("file.txt");
        try (FileWriter fw = new FileWriter(file)){
            fw.write("o devDojo é lindo, é o melhor curso do brasil\n Continuando a vantoria na proxima linha ");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
