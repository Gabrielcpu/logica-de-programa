package JavaCore.QString.Teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Gabriel Carvalho";
        nome.concat("dev prof");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Gabriel Carvalho");
        sb.append(" dev dojo ").append("conselho");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
