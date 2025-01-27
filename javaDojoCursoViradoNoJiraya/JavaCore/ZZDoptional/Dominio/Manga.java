package JavaCore.ZZDoptional.Dominio;

public class Manga {
    private Integer id;
    private String title;
    private int chapters;

    public Manga(int chapters, Integer id, String title) {
        this.chapters = chapters;
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "chapters=" + chapters +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getChapters() {
        return chapters;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
