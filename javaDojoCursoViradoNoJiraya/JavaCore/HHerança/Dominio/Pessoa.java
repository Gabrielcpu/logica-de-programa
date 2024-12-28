package JavaCore.HHerança.Dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
   static {
       System.out.println(" dentro do bloco inicialização estatico Pessoa");
   }
    {
        System.out.println(" dentro do bloco inicialização Pessoa");
    }
    public  Pessoa( String nome){
        System.out.println("Dentro do construtor de pessoa");
      this.nome = nome;
    }
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        if (this.endereco != null){
            System.out.println(this.endereco.getRua());
            System.out.println(this.endereco.getCep());
        }else {
            System.out.println("endereço nao definido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
