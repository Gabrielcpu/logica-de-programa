package JavaCore.ZZBComportamento.Teste;

import JavaCore.ZZBComportamento.Dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {
   private static List<Car> cars = List.of(new Car(2011, "green"), new Car(1098, "black"), new Car(2019, "red"));

    public static void main(String[] args) {
        System.out.println(filterGreencar(cars));
        System.out.println(filtercarColor(cars,"green"));
        System.out.println(filtercarColor(cars,"red"));
        System.out.println("-------------------------");
        System.out.println(filterano(cars,2015));
    }
    private static List<Car> filterGreencar(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterCar.add(car);
            }
        }

        return filterCar;
    }
    private static List<Car> filtercarColor(List<Car> cars,String color) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
    private static List<Car> filterano(List<Car> cars,int ano) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getAno()< ano) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
