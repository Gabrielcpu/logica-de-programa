package JavaCore.SFormatacao.Teste;

import java.util.Locale;

public class LocalTEste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isolanguages = Locale.getISOLanguages();
        for (String isolanguage :isolanguages){
            System.out.print(isolanguage);
        }
        System.out.println();

        for (String isoCointry : isoCountries){
            System.out.print(isoCointry+ " ");
        }

    }
}
