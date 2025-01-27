package JavaCore.ZZDoptional.Teste;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptinalTeste01 {
    public static void main(String[] args) {
      Optional<String> o1 = Optional.of("Gabriel");
      Optional<String> o2 = Optional.ofNullable(null);
      Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("-------------");

        Optional<String> nameOptinal = finName("Gabriel");
        String empty = nameOptinal.orElse("Empty");
        System.out.println(nameOptinal);
        nameOptinal.ifPresent(s -> System.out.println(s.toUpperCase()));

    }
    private static Optional<String> finName (String name){
        List<String> list = List.of("Gabriel", "DevDojo");
        int i = list.indexOf(name);
        if(i != 1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
