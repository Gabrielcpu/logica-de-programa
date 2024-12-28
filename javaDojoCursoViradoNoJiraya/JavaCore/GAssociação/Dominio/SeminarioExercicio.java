package JavaCore.GAssociação.Dominio;


public class SeminarioExercicio {
    private String titulo;
    private AlunoExercicio[] alunos;
    private LocalExercicio local;

    public SeminarioExercicio(String titulo, LocalExercicio local){
        this.titulo = titulo;
        this.local = local;
    }

    public SeminarioExercicio(String titulo,AlunoExercicio[] alunos, LocalExercicio local) {
        this.alunos = alunos;
        this.local = local;
        this.titulo = titulo;
    }

    public LocalExercicio getLocal() {
        return local;
    }

    public void setLocal(LocalExercicio local) {
        this.local = local;
    }

    public AlunoExercicio[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AlunoExercicio[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

