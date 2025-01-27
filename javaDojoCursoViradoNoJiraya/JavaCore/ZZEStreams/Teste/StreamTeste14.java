package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.Category;
import JavaCore.ZZEStreams.Dominio.LightNovel;
import JavaCore.ZZEStreams.Dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTeste14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel(Category.FANTASY, 8.99, "Tensei Shittra"),
            new LightNovel(Category.FANTASY, 10.99, "Overlord"),
            new LightNovel(Category.DRAMA, 5.99, "Violet Evargarden"),
            new LightNovel(Category.FANTASY, 2.99, "No Game No Life"),
            new LightNovel(Category.FANTASY, 5.99, "Fullmetal Alchemist"),
            new LightNovel(Category.FANTASY, 1.99, "Kumo desuga"),
            new LightNovel(Category.FANTASY, 1.99, "Kumo desuga"),
            new LightNovel(Category.ROMANCE, 4.00, "Monogatari")
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
