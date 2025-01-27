package JavaCore.ZZBComportamento.Teste;

import JavaCore.ZZBComportamento.Dominio.Car;
import JavaCore.ZZBComportamento.Interface.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste02 {
    private static List<Car> cars = List.of(new Car(2011, "green"), new Car(1098, "black"), new Car(2019, "red"));

    public static void main(String[] args) {
       /* List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });*/
        List<Car> greenCars = filter(cars,car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars,car -> car.getColor().equals("red"));
        List<Car> anoCars = filter(cars,car -> car.getAno()< 2011);
        System.out.println(redCars);
        System.out.println(greenCars);
        System.out.println("------------");
        System.out.println(anoCars);
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
