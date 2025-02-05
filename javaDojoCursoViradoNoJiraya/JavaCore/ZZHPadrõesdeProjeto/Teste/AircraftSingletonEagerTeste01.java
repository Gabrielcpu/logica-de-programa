package JavaCore.ZZHPadrõesdeProjeto.Teste;

import JavaCore.ZZHPadrõesdeProjeto.domino.AircraftSingletonEager;

public class AircraftSingletonEagerTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTeste01.bookSeat("1A");

    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTACE());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTACE();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
