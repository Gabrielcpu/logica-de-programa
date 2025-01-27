package JavaCore.ZZBComportamento.Dominio;

public class Car {
    private String nome = "Audi";
    private String color;
    private int ano;

    public Car(int ano, String color) {
        this.color = color;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ano=" + ano +
                ", nome='" + nome + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getAno() {
        return ano;
    }

    public String getColor() {
        return color;
    }

    public String getNome() {
        return nome;
    }
}
