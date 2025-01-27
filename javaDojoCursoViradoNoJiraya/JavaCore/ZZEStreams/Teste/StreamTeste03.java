package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(

            new LightNovel(8.99, "Tensei Shittra"),
            new LightNovel(3.99, "Overlord"),
            new LightNovel(5.99, "Violet Evargarden"),
            new LightNovel(2.99, "No Game No Life"),
            new LightNovel(5.99, "Fullmetal Alchemist"),
            new LightNovel(1.99, "Kumo desuga"),
            new LightNovel(1.99, "Kumo desuga"),
            new LightNovel(4.00, "Monogatari")
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.stream().forEach( System.out::println);

        long count = stream
                .filter(lithNovel -> lithNovel.getPrice() <= 4)
                .count();

       long count1 = lightNovels.stream()
               .distinct()
               .filter(lithNovel -> lithNovel.getPrice() <= 4)
               .count();
        System.out.println(count);
        System.out.println(count1);
    }
}
