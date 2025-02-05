package JavaCore.ZZHPadrõesdeProjeto.domino;

import java.util.HashSet;
import java.util.Set;

public  final class Aircraft {
    private final Set<String> avaibleseats = new HashSet<>();
  private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        avaibleseats.add("1A");
        avaibleseats.add("1B");
    }
    public boolean bookSeat(String seat){
        return avaibleseats.remove(seat);
    }

    public String getName() {
        return name;
    }
}
