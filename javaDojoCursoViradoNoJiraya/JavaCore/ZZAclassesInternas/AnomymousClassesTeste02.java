package JavaCore.ZZAclassesInternas;


import JavaCore.ZGenerics.Dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;

class BarcoNameCOmparator implements Comparator<Barco> {

    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnomymousClassesTeste02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>( List.of(new Barco("canoa"), new Barco("lancha")));

        barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        System.out.println(barcoList);
    }
}
