package JavaCore.GAssociação.Dominio;

public class ProfessorExercicio {
    private String nome;
    private String especialidade;
   private SeminarioExercicio [] seminarios;

    public ProfessorExercicio(String nome) {
        this.nome = nome;
    }

    public ProfessorExercicio(String especialidade, String nome) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public ProfessorExercicio(String especialidade, String nome, SeminarioExercicio[] seminatios) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.seminarios = seminatios;
    }

    public SeminarioExercicio[] getSeminatios() {
        return seminarios;
    }
 public  void imprime (){
     System.out.println("-------------");
     System.out.println("Professor "+this.nome);
     if (nome == null)return;
     System.out.println("## Seminario cadrastado ##");
     for (SeminarioExercicio seminario : seminarios){
         System.out.println(seminario.getTitulo());
         System.out.println(seminario.getLocal().getEndereço());
         if (seminario.getAlunos()== null || seminario.getAlunos().length == 0) continue;
         System.out.println("** Aluno **");
         for (AlunoExercicio aluno : seminario.getAlunos()){
             System.out.println("aluno :"+aluno.getNome()+" idade :"+aluno.getIdade() );
         }
     }

 }
    public void setSeminatios(SeminarioExercicio[] seminatios) {
        this.seminarios = seminatios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
