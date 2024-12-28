package JavaCore.SFormatacao.Teste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SImpledateFormatTeste01 {
    public static void main(String[] args) {
        String pattern= "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

    }
}
