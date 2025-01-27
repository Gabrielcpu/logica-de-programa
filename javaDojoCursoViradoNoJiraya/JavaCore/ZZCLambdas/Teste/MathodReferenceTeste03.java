package JavaCore.ZZCLambdas.Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//refrence to on instance method of on arbitrary object of o particular type
public class MathodReferenceTeste03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Rimuru", "veldora", "hikimaru"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String,Integer> numStringToInt = Integer::parseInt;
        Integer num = numStringToInt.apply("10");
        System.out.println(num);

        BiPredicate <List<String>,String> checkName = List::contains;
        System.out.println(checkName.test(list, "veldora"));
    }
}
