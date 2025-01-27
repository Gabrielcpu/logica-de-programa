package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste11 {
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
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);

    }
}
