package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTeste06 {
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
        System.out.println(lightNovels.stream().anyMatch(lithNovel -> lithNovel.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(lithNovel -> lithNovel.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(lithNovel -> lithNovel.getPrice() < 0));
        lightNovels
                .stream()
                .filter(lithNovel -> lithNovel.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(lithNovel -> lithNovel.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getTitle).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice).reversed())
                .ifPresent(System.out::println);
    }
}

