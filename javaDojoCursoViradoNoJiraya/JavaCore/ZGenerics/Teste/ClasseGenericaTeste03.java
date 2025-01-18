package JavaCore.ZGenerics.Teste;


import JavaCore.ZGenerics.Dominio.Barco;
import JavaCore.ZGenerics.Dominio.Carro;
import JavaCore.ZGenerics.Serviço.BarcoRentavelService;
import JavaCore.ZGenerics.Serviço.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste03 {
    public static void main(String[] args) {
        List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("Canoa")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        RentalService<Carro> rentalServiceCArro = new RentalService<>(carrosDisponiveis);
        Object carro = rentalServiceCArro.buscarObjetoDisponivel();
        System.out.println("usando o carro por um mês...");
        rentalServiceCArro.retornarObjetoAlugado((Carro) carro);

        System.out.println("-------------------------------");
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcoDisponiveis);
        Object barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado((Barco) barco);
    }
}

