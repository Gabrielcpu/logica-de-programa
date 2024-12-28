package JavaCore.NPolimorfismo.Serviço;

import JavaCore.NPolimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em um arquivo");
    }
}
