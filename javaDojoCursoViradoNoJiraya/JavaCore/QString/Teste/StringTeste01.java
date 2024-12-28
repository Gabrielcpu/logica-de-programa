package JavaCore.QString.Teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome01 = "gabriel"; //String constant pool
        String nome02 = "gabriel";
        nome01 = nome01.concat(" suane");// nome += suane
        System.out.println(nome01);
        System.out.println(nome01 == nome02);
        //1 criando uma variavel de referencia
        //2 objeto do tipo String
        //3 uma String no poolString
        String nome3 = new String("gabriel");
        System.out.println(nome02 == nome3);
        System.out.println(nome02 == nome3.intern());
    }
}
