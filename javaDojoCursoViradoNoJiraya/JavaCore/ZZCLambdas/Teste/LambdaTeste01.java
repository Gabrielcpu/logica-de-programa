package JavaCore.ZZCLambdas.Teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> string = List.of("Gabriel", "carvalho", "Luffy", "zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(string, System.out::println);
        forEach(integers, System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
