package JavaCore.ZZCLambdas.Dominio;

public class Anime {
    private String title;
    private Integer quantity;

    public Anime(Integer quantity, String title) {
        this.quantity = quantity;
        this.title = title;
    }

    public Anime(String string, Integer integer) {

    }

    @Override
    public String toString() {
        return "Anime{" +
                "quantity=" + quantity +
                ", title='" + title + '\'' +
                '}';
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return title;
    }
}
