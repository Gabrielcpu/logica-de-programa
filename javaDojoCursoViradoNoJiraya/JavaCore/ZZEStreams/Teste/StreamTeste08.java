package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTeste08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel(8.99, "Tensei Shittra"),
            new LightNovel(10.99, "Overlord"),
            new LightNovel(5.99, "Violet Evargarden"),
            new LightNovel(2.99, "No Game No Life"),
            new LightNovel(5.99, "Fullmetal Alchemist"),
            new LightNovel(1.99, "Kumo desuga"),
            new LightNovel(1.99, "Kumo desuga"),
            new LightNovel(4.00, "Monogatari")
    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .filter(lithNovel -> lithNovel.getPrice() > 3)
                .map(LightNovel::getPrice)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()//Stream<doble>
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
    }
}
