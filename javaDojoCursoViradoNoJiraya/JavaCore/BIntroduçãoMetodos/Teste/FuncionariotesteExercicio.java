package JavaCore.BIntroduçãoMetodos.Teste;

import JavaCore.BIntroduçãoMetodos.Dominio.FuncionarioExercicio;

public class FuncionariotesteExercicio {
    public static void main(String[] args) {
        double[] salarios = {2111, 3900, 2990};
        FuncionarioExercicio funcionario = new FuncionarioExercicio("kirito", 21, salarios);
        funcionario.ImprimirDados();

    }
}
