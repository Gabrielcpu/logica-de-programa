package JavaCore.FModificadorEstatico.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0- bloco de inicialização é executado quando a JVM carregar a classe
    //1- é alocado espaço em memoria pro projeto
    //2- cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3- bloco de inicialização é executado
    //4- Construtor é executado
    static {
        System.out.println("dentro do bloco de inicialização estatico 3 ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("dentro do bloco de inicialização estatico 2 ");
    }
    static {
        System.out.println("dentro do bloco de inicialização estatico 1 ");
    }
    {
        System.out.println("dentro do bloco de inicialização não estatico ");

    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}

