package JavaCore.HHerança.Teste;

import JavaCore.HHerança.Dominio.Endereco;
import JavaCore.HHerança.Dominio.Funcionario;
import JavaCore.HHerança.Dominio.Pessoa;

public class HerançaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa =new Pessoa("guilherme");
        pessoa.setCpf("127766837-32");

        Endereco endereco = new Endereco();
        endereco.setRua("rua 3");
        endereco.setCep("12323-293");

        pessoa.setEndereco(endereco);
       pessoa.imprime();
        System.out.println("--------------");
        Funcionario funcionario = new Funcionario("eiichiro oda");
        funcionario.setCpf("124343");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(50000);
        funcionario.imprime();

    }
}