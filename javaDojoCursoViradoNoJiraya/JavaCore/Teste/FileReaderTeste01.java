package JavaCore.Teste;

import java.io.File;
import java.io.FileReader;

public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file= new File("file.txt");
        try(FileReader fr = new FileReader(file)){
       //   char[] in = new char[100];
       //     int size = fr.read(in);
       //     System.out.println(size);
       //     for (char c : in){
       //         System.out.print(c);
       //     }
            int i ;
            while ((i= fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
