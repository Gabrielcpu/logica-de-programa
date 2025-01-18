package JavaCore.Xseralização.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -1049620458851799077L;
    private long id;
    private String nome;
    private transient String password;
    private static final String nomeEscola = "escola virado no jiraya";
    private transient Turma turma;

    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
        System.out.println("dentro do construtor");
    }
@Serial
    private void writoObject(ObjectOutputStream oos) {
    try {
        oos.defaultWriteObject();
        oos.writeUTF(turma.getNome());

    } catch (IOException e) {
        e.printStackTrace();
    }
}

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nometurma = ois.readUTF();
            turma = new Turma(nometurma);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nome escola='" + nomeEscola + '\'' +
                ", Turma ='" + turma + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
