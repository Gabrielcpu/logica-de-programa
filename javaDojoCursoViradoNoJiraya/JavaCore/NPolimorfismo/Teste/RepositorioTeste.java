package JavaCore.NPolimorfismo.Teste;

import JavaCore.NPolimorfismo.Repositorio.Repositorio;
import JavaCore.NPolimorfismo.Serviço.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
         Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("goku");
        list.add("vegeta");
        list.add("kuririn");
        System.out.println(list);
    }
}
