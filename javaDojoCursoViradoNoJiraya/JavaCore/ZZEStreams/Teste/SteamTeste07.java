package JavaCore.ZZEStreams.Teste;

import java.util.List;

public class SteamTeste07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);
        integers.stream().reduce( (a,b) -> a + b).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, (a,b) -> a + b));

        integers.stream().reduce( Integer::sum).ifPresent(System.out::println);
        System.out.println( integers.stream().reduce(0, Integer::sum));

        System.out.println("--------------------------");

        integers.stream().reduce( (a,b) -> a * b).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (a,b) -> a * b));

        System.out.println("--------------------------");

        integers.stream().reduce( (a,b) -> a> b ? a: b).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce( 0,Integer::max));
    }
}
