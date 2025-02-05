package JavaCore.ZZHPadrõesdeProjeto.domino;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
   //Eager initiolization
    private static final  AircraftSingletonEager INSTACE = new AircraftSingletonEager("787-900");
    private final Set<String> avaibleseats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        avaibleseats.add("1A");
        avaibleseats.add("1B");
    }

    public static AircraftSingletonEager getINSTACE() {
        return INSTACE;
    }

    public boolean bookSeat(String seat){
        return avaibleseats.remove(seat);
    }
}
