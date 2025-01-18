package JavaCore.ZGenerics.Serviço;

import JavaCore.ZGenerics.Dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("lancha"),new Barco("Canoa")));

    public Barco buscarCarroDisponivel(){
        System.out.println("Buscando Barco disponivel...");
        Barco barco = barcoDisponiveis.remove(0);
        System.out.println("Alugando Barco: "+ barco);
        System.out.println("BArcos disponiveis para alugar:");
        System.out.println(barcoDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo Barco:"+ barco);
        barcoDisponiveis.add(barco);
        System.out.println("Barcos dispiniveis para alugar:");
        System.out.println(barcoDisponiveis);
    }
}
