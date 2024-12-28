package JavaCore.URegex.Teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTeste03 {
    public static void main(String[] args) {
        // \d = todo os digitos
        // \D = tudo o que nao for digitado
        // \s = Epaço em branco \t \n \f \r
        // \S = todo os caracters excluindo o branco
        // \w = tudo o que for de a-ZA-Z, digitos;
        // \W = Tudo o que nao for incluso no \w
        // []
       // String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        // String texto = "abaab";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto :   "+texto2);
        System.out.println("indice :  0123456879");
        System.out.println("regex "+regex);
        System.out.println("Posiçoes encontrada");
        while (matcher.find()){
        System.out.print(matcher.start()+" "+ matcher.group()+"\n");
        }
        int numerohex = 0x0;
        System.out.println(numerohex);
    }
}
