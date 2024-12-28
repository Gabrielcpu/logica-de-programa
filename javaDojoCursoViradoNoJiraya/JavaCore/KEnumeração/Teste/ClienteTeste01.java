package JavaCore.KEnumeração.Teste;

import JavaCore.KEnumeração.Dominio.Cliente;
import JavaCore.KEnumeração.Dominio.TipoCliente;
import  JavaCore.KEnumeração.Dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente01 =new Cliente("tsubasa", TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        Cliente cliente02 =new Cliente("tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.CREDITO.CalcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.CalcularDesconto(100));
       TipoCliente tipoCliente= TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2= TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente2);


    }
}
