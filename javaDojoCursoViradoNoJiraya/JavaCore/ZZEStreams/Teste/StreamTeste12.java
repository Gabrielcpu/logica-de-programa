package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.Category;
import JavaCore.ZZEStreams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste12 {
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
        Map<Category, List<LightNovel>> map = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA:
                    drama.add(lightNovel);break;
                case FANTASY:
                    drama.add(lightNovel);break;
                case ROMANCE:
                    drama.add(lightNovel);break;
            }
            map.put(Category.FANTASY, fantasy);
            map.put(Category.DRAMA, drama);
            map.put(Category.ROMANCE, romance);
            System.out.println(map);

            System.out.println("-------------------------");

            Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
            System.out.println(collect);
        }

    }
}
