package JavaCore.NPolimorfismo.Serviço;

import JavaCore.NPolimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em uma memoria");
    }
}
