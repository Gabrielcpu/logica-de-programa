package JavaCore.ZZBComportamento.Teste;

import JavaCore.ZZBComportamento.Dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste03 {
    private static List<Car> cars = List.of(new Car(2011, "green"), new Car(1098, "black"), new Car(2019, "red"));

    public static void main(String[] args) {

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> anoCars = filter(cars, car -> car.getAno() < 2011);
        System.out.println(redCars);
        System.out.println(greenCars);
        System.out.println("------------");
        System.out.println(anoCars);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> carPredicate) {
        List<T> filredLista = new ArrayList<>();
        for (T e : list) {
            if (carPredicate.test(e)) {
                filredLista.add(e);
            }
        }
        return filredLista;
    }
}
