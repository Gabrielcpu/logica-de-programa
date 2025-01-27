package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.Category;
import JavaCore.ZZEStreams.Dominio.LightNovel;
import JavaCore.ZZEStreams.Dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class StreamTeste15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);
//Map<CAtegory, List<Promotion>
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTeste15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTeste15::getPromotion,
                        Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }
    private static Promotion getPromotion(LightNovel ln) {
      return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
