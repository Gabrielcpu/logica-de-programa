package JavaCore.ZZHPadrõesdeProjeto.Teste;

import JavaCore.ZZHPadrõesdeProjeto.domino.AircraftSingletonEager;
import JavaCore.ZZHPadrõesdeProjeto.domino.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTeste01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLazy.getINSTACE());
        System.out.println(AircraftSingletonLazy.getINSTACE());
        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazy);
    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonLazy.getINSTACE());
        AircraftSingletonLazy aircraftSingletonEager = AircraftSingletonLazy.getINSTACE();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
