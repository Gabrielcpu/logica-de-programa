package JavaCore.GAssociação.Dominio;

public class Escola {
    private String nome;
    private Professor[] profesores;

    public Escola(String nome, Professor[] profesores) {
        this.nome = nome;
        this.profesores = profesores;
    }

    public  void imprime (){
        System.out.println(this.nome);
        if (profesores == null) return;
        for (Professor professor : profesores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Professor[] profesores) {
        this.profesores = profesores;
    }
}

