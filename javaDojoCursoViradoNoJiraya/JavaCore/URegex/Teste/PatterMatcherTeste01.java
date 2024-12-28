package JavaCore.URegex.Teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTeste01 {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abaab";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto :   "+texto2);
        System.out.println("indice :  0123456879");
        System.out.println("regex "+regex);
        System.out.println("Posiçoes encontrada");
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
