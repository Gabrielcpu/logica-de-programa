package JavaCore.ZZEStreams.Teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.getFirst().split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect =  words.stream().map(w -> w.split("")).toList();
        Stream<String> stream = Arrays.stream(letters);
        List<String> letters2 = words.stream()
                .map(w -> w.split("")) // stream<String[]>
                .flatMap(Arrays::stream) //<Stream<String>
                .collect(Collectors.toList());
        System.out.println(letters2);
    }
}
