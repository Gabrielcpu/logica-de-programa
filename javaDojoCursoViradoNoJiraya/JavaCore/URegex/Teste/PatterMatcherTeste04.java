package JavaCore.URegex.Teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTeste04 {
    public static void main(String[] args) {
        // \d = todo os digitos
        // \D = tudo o que nao for digitado
        // \s = Epaço em branco \t \n \f \r
        // \S = todo os caracters excluindo o branco
        // \w = tudo o que for de a-ZA-Z, digitos;
        // \W = Tudo o que nao for incluso no \w
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // ()
        // | o(v|c)o ovo | oco
        // $
        // . 1.3 = 123, 133,103
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto :   "+texto);
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
