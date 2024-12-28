package JavaCore.LClassesAbstratas.Teste;

import JavaCore.LClassesAbstratas.Dominio.Desenvolvedor;
import JavaCore.LClassesAbstratas.Dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
