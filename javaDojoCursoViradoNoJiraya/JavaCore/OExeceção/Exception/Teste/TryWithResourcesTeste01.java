package JavaCore.OExeceção.Exception.Teste;

import JavaCore.OExeceção.Exception.Dominio.Leitor01;
import JavaCore.OExeceção.Exception.Dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
lerArquivo();
    }

    public static void lerArquivo(){
        try (Leitor01 leitor01 = new Leitor01();
             Leitor2 leitor2 = new Leitor2() ){

        }catch (IOException e){

        }
    }

        public static void lerArquivo02 (){
        Reader reader = null;
        try {
            reader  = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
