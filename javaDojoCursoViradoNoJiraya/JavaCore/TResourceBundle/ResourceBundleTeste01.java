package JavaCore.TResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("menssagem", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
         bundle = ResourceBundle.getBundle("menssagem", new Locale("en", "Us"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        //locale("fr","CA"
        //messagens_fr_CA.properties
        //messagens_fr.properties
        //messagens_pt_BR.properties
        //messagens_pt.properties
        //messagens.properties
        System.out.println(bundle.getString("Hi"));

    }
}
