package introdução;

public class javadojotiposprimitivos {
    public static void main(String[] args) {
        // int, double ,float ,char , byte , shot ,long ,boolean
        //casting = (a variavel declarada) forçando um numero maior que poça ser suportado
        int idade2 = (int) 10000000000000000L;
        int idade = 18;
        long numeroGrande = 1888888888L;
        //double pode ter decimais
        double SalarioDouble = 2000;
        float SalarioFloat = 2500;
        byte IdadeByte = 18;
        short IdadeShort = 18;
        boolean Verdadeiro = true;
        boolean falso = false;
        // char separa tanto a tabela code, e a tabaela ascii
        char Caractere = 65;
        //String
        String nome = "grande nome";
        System.out.println(idade);
        System.out.println(Caractere);
        System.out.println(nome);
    }
}
