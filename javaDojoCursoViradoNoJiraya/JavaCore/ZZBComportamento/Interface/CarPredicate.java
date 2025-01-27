package JavaCore.ZZBComportamento.Interface;

import JavaCore.ZZBComportamento.Dominio.Car;

public interface CarPredicate {
    //anonimas , funções,conciso
    boolean test(Car car);
    //(parametro)-> <Expressão>
    //(Car car) -> car.getColar().equals("green");
}

