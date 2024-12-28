package JavaCore.CSobreCargaMetodos.Dominio;

public class Anime {
    private String tipo;
    private int episodio;
    private String nome;
    private String genero;

    public void inity(String nome, String tipo, int episodio) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
    }
// para csos aonde vocé nao esta trabalhando com as duas classes é melhor cirar outro metodo do que motificar e dar erro

    public void inity(String nome, String tipo, int episodio, String genero) {
        this.inity(nome, tipo, episodio);
        this.genero = genero;
    }

    public void impeime() {
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.nome);
        System.out.println(this.genero);
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
