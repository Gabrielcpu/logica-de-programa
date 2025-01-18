package JavaCore.ZGenerics.Teste;

import JavaCore.Ycolecoes.Dominio.Comsumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {
        //Type erasure
        List<String> list = new ArrayList<>();
        list.add("MIdorya");
        list.add("MIdorya");


        for (String o : list) {
            System.out.println(o);
        }
        add(list, new Comsumidor("MIdorya"));
        for (Object o : list) {
            System.out.println(o);
        }

    }
    private static void add(List list, Comsumidor comsumidor) {
        list.add(comsumidor);
    }
}
