package JavaCore.ZGenerics.Teste;

import JavaCore.ZGenerics.Dominio.Barco;
import JavaCore.ZGenerics.Dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoteste01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }
    private static <T > List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
   /* private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }*/
}

