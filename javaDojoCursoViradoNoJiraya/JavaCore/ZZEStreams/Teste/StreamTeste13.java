package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.Category;
import JavaCore.ZZEStreams.Dominio.LightNovel;
import JavaCore.ZZEStreams.Dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().
                collect(Collectors.groupingBy(LightNovel ->
                             LightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                        ));
        System.out.println(collect);
        //map<Caterogy, Map<Promotion, List<LightNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(LightNovel ->
                LightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
        )));
        System.out.println(collect1);
    }
}
