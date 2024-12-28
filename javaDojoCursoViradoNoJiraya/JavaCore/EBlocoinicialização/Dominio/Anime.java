package JavaCore.EBlocoinicialização.Dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //1- é alocado espaço em memoria pro projeto
    //2- cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3- bloco de inicialização é executado
    //4- Construtor é executado
    {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : this.episodios) {
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

