package JavaCore.ZGenerics.Teste;

import JavaCore.ZGenerics.Dominio.Carro;
import JavaCore.ZGenerics.Serviço.CArroRentavelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CArroRentavelService cArroRentavelService= new CArroRentavelService();
        Carro carro = cArroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês ...");
        cArroRentavelService.retornarCarroAlugado(carro);
    }
}

