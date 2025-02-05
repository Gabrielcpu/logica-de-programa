package JavaCore.ZZHPadrõesdeProjeto.Teste;

import JavaCore.ZZHPadrõesdeProjeto.domino.Aircraft;
import JavaCore.ZZHPadrõesdeProjeto.domino.AircraftSingletonEager;

public class AircraftTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
     static void bookSeat(String seat){
         System.out.println(AircraftSingletonEager.getINSTACE());
       /* Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));*/
    }
}
