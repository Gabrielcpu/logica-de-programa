package JavaCore.ZZHPadrõesdeProjeto.domino;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    //Eager initiolization
    private static AircraftSingletonLazy INSTACE;
    private final Set<String> avaibleseats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        avaibleseats.add("1A");
        avaibleseats.add("1B");
    }

    public static AircraftSingletonLazy getINSTACE() {
        if (INSTACE == null) {
            synchronized (AircraftSingletonLazy.class) {
               if (INSTACE == null){
                   INSTACE = new AircraftSingletonLazy("787-900");
               }
            }
        }
        return INSTACE;
    }

    public boolean bookSeat(String seat) {
        return avaibleseats.remove(seat);
    }
}
