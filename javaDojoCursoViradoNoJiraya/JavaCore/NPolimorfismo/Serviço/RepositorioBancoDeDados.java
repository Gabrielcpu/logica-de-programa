package JavaCore.NPolimorfismo.Serviço;

import JavaCore.NPolimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em um banco de dados");
    }
}
