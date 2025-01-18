package JavaCore.ZGenerics.Serviço;

import JavaCore.ZGenerics.Dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CArroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),new Carro("Fusca")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+ carro);
        System.out.println("CArros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro:"+ carro);
        carrosDisponiveis.add(carro);
        System.out.println("carros dispiniveis para alugar:");
        System.out.println(carrosDisponiveis);
    }
}
