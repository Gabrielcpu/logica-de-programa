package JavaCore.Ycolecoes.Dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Comsumidor {
    public Long id;
    private String nome;

    public Comsumidor( String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comsumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Comsumidor that = (Comsumidor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getNome() {
        return nome;
    }
}
