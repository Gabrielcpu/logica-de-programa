package JavaCore.SFormatacao.Teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTeste01 {
    public static void main(String[] args) {
        // Brasil = pt-BR
        Locale localeItaly = new Locale("IT","IT");
        Locale localeCH = new Locale("IT","CH");
        Locale localeIndia = new Locale("Hi","IN");
        Locale localeJapão = new Locale("JA","JP");
        Locale localeHolanda = new Locale("NL","NL");

        Calendar calendar = Calendar.getInstance();
       DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeJapão);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,localeHolanda);


        System.out.println("italia "+df1.format(calendar.getTime()));
        System.out.println("Suiça "+df2.format(calendar.getTime()));
        System.out.println("India "+df3.format(calendar.getTime()));
        System.out.println("Japão "+df4.format(calendar.getTime()));
        System.out.println("Holanda "+df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapão));
        System.out.println(localeCH.getDisplayCountry(localeHolanda));
        System.out.println(localeItaly.getDisplayLanguage(localeJapão));
        
    }
}
