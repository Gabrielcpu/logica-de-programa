package JavaCore.ZGenerics.Serviço;

import java.util.List;

public class RentalService<T> {
    private List<T> ObjetoDisponiveis ;

    public RentalService(List<T> ObjetoDisponiveis){
        this.ObjetoDisponiveis = ObjetoDisponiveis;
    }
    public T buscarObjetoDisponivel(){
        System.out.println("Buscando Objeto disponivel...");
        T t = ObjetoDisponiveis.remove(0);
        System.out.println("Alugando Objeto: "+ t);
        System.out.println("Objeto disponiveis para alugar:");
        System.out.println(ObjetoDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo Objeto:"+ t);
        ObjetoDisponiveis.add(t);
        System.out.println("Objeto dispiniveis para alugar:");
        System.out.println(ObjetoDisponiveis);
    }
}
