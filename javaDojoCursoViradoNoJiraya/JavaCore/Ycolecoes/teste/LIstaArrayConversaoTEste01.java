package JavaCore.Ycolecoes.teste;

import java.util.Arrays;
import java.util.List;

public class LIstaArrayConversaoTEste01 {
    public static void main(String[] args) {
        List<Integer> numeros = new java.util.ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] ListeTOArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(ListeTOArray));
        System.out.println("------------------------");
        Integer[] numeroArray = new Integer[3];
        numeroArray[0] = 1;
        numeroArray[1] = 2;
        numeroArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numeroArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numeroArray));
        System.out.println(arrayToList);

        System.out.println("------------------------");
        List<Integer> numerosList = new java.util.ArrayList<>(Arrays.asList(numeroArray));
        numerosList.add(15);
        System.out.println(numerosList);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List.of("1","2");
    }
}
