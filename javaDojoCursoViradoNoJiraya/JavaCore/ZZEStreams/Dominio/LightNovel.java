package JavaCore.ZZEStreams.Dominio;

import java.util.Objects;

public class LightNovel {
    private String title;
    private double price;
    private Category category;

    public LightNovel(double price, String title) {
        this.price = price;
        this.title = title;
    }

    public LightNovel(Category category, double price, String title) {
        this.category = category;
        this.price = price;
        this.title = title;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "category=" + category +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
