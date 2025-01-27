package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Order LightNovel by title
//2. Retrieve the first 3 title light Novels with price less thon 4
public class StreamTeste01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel(8.99, "Tensei Shittra"),
            new LightNovel(3.99, "Overlord"),
            new LightNovel(5.99, "Violet Evargarden"),
            new LightNovel(2.99, "No Game No Life"),
            new LightNovel(5.99, "Fullmetal Alchemist"),
            new LightNovel(1.99, "Kumo desuga"),
            new LightNovel(4.00, "Monogatari")
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lithNovel : lightNovels) {
            if (lithNovel.getPrice() <= 4) {
                titles.add(lithNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);
    }

}
