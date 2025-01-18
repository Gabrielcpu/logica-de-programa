package JavaCore.Xseralização.teste;

import JavaCore.Xseralização.dominio.Aluno;
import JavaCore.Xseralização.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class serializçãoteste01 {
    public static void main(String[] args) {
       Aluno aluno = new Aluno(1L, "Gabriel carvalho", "0714444");
        Turma turma = new Turma("Maratona java no jiraya em breve ricos");
        aluno.setNome("Gabriel");
     //  serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desserializar() {
        Path path = Paths.get("aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
