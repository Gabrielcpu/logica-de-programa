package JavaCore.DConstrutores.Dominio;

public class Anime {
    private String tipo;
    private int episodio;
    private String nome;
    private String genero;
    private String studio;

    // construtor
    public Anime(String nome, String tipo, int episodio, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodio, String genero,String studio) {
        this(nome,tipo,episodio,genero);
        this.studio = studio;
    }
    public Anime() {
        System.out.println("dentro do construtor sem argumentos");
    }

    public void impeime() {
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getEpisodio() {
        return this.episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
