package JavaCore.ZZHPadrõesdeProjeto.Teste;

import JavaCore.ZZHPadrõesdeProjeto.domino.AircrafSinglrtonEnum;
import JavaCore.ZZHPadrõesdeProjeto.domino.AircraftSingletonLazy;

public class AircrafSinglrtonEnumTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private static void bookSeat(String seat){
        System.out.println(AircrafSinglrtonEnum.INSTANCE.hashCode());
        AircrafSinglrtonEnum instance  = AircrafSinglrtonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }

}
