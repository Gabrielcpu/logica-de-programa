package JavaCore.ZZJCRUD.Dominio;

import java.util.Objects;

public class Anime {
    Integer id;
    String name;
    int episodes;
    Producer anime;

    public int getEpisodes() {
        return episodes;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Producer getAnime() {
        return anime;
    }

    public static final class AnimeBuilder {
        private int episodes;
        private Integer id;
        private String name;
        private Producer producer;

        private AnimeBuilder() {
        }

        public static AnimeBuilder builder() {
            return new AnimeBuilder();
        }

        public AnimeBuilder withEpisodes(int episodes) {
            this.episodes = episodes;
            return this;
        }

        public AnimeBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public AnimeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public AnimeBuilder withProducer(Producer producer) {
            this.producer = producer;
            return this;
        }

        public Anime build() {
            Anime anime = new Anime();
            anime.name = this.name;
            anime.anime = this.producer;
            anime.id = this.id;
            anime.episodes = this.episodes;
            return anime;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            AnimeBuilder that = (AnimeBuilder) o;
            return episodes == that.episodes && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(producer, that.producer);
        }

        @Override
        public int hashCode() {
            return Objects.hash(episodes, id, name, producer);
        }

        public int getEpisodes() {
            return episodes;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Producer getProducer() {
            return producer;
        }
    }
}
