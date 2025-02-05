package JavaCore.ZZHPadrõesdeProjeto.domino;

import java.util.HashSet;
import java.util.Set;

public enum AircrafSinglrtonEnum {
    INSTANCE;
    private final Set<String> avaibleseats;

    AircrafSinglrtonEnum() {
        this.avaibleseats = new HashSet<>();
        this.avaibleseats.add("1A");
        this.avaibleseats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return avaibleseats.remove(seat);
    }
}
