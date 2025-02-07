package JavaCore.ZZKJUnit.Dominio;

import java.util.Objects;

public record Manga(String name, int epidodes) {
    public Manga {
        Objects.requireNonNull(name);
    }
}
