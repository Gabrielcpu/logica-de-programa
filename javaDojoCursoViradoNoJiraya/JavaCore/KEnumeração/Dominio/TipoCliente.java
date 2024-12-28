package JavaCore.KEnumeração.Dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa fisica"),
    PESSOA_JURIDICA(2,"pessoa juridica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }


   public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
   for (TipoCliente tipo : TipoCliente.values()){
       if (tipo.getNomeRelatorio().equals(nomeRelatorio)){
           return tipo;
       }
   }
   throw new IllegalArgumentException("Tipocliente não encontrado para o nome:"+ nomeRelatorio);
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
