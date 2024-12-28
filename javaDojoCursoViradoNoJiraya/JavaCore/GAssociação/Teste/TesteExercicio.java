package JavaCore.GAssociação.Teste;

import JavaCore.GAssociação.Dominio.AlunoExercicio;
import JavaCore.GAssociação.Dominio.LocalExercicio;
import JavaCore.GAssociação.Dominio.ProfessorExercicio;
import JavaCore.GAssociação.Dominio.SeminarioExercicio;

public class TesteExercicio {
    public static void main(String[] args) {
        LocalExercicio local = new LocalExercicio("rua das arvores, numero 545, centro");
        AlunoExercicio aluno01 = new AlunoExercicio(17, "gabriel");
        ProfessorExercicio professoror1 = new ProfessorExercicio("Matematica", "Carlos");
        AlunoExercicio[] alunos = {aluno01};
        SeminarioExercicio seminario = new SeminarioExercicio("algoritimo", alunos, local);
        SeminarioExercicio[] seminariosDisponiveis = {seminario};
        professoror1.setSeminatios(seminariosDisponiveis);
       professoror1.imprime();
    }
}
