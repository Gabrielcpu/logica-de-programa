package JavaCore.ZGenerics.Teste;

import JavaCore.ZGenerics.Dominio.Barco;
import JavaCore.ZGenerics.Dominio.Carro;
import JavaCore.ZGenerics.Serviço.BarcoRentavelService;
import JavaCore.ZGenerics.Serviço.CArroRentavelService;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {
        BarcoRentavelService BarcoRentavelService= new BarcoRentavelService();
        Barco barco = BarcoRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o BArco por um mês ...");
        BarcoRentavelService.retornarBarcoAlugado(barco);
    }
}

