package JavaCore.ZZEStreams.Teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTeste04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphcDesigners = List.of("Gabriel carvalho","Catarina santos","Sandy carroso");
        List<String> developers = List.of("Gabriel","Devid","Harisson");
        List<String> studens= List.of("Edipo","Gustavo lima","Gustavo mensdes","guilherme");
        devDojo.add(graphcDesigners);
        devDojo.add(developers);
        devDojo.add(studens);
        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("------------------");
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
