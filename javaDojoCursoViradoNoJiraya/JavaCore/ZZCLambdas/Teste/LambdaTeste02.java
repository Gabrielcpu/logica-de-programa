package JavaCore.ZZCLambdas.Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Gabriel", "carvalho", "Luffy", "zoro");
        List<Integer> interger = map(strings, (String s) -> s.length());
        List<String> map = map(strings,s -> s.toUpperCase());
        System.out.println(interger);

    }
    private static <T,R>List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R apply = function.apply(e);
            result.add(apply);
        }
        return result;
    }
}
