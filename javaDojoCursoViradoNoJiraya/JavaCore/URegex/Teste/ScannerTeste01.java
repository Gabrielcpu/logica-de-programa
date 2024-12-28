package JavaCore.URegex.Teste;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String texto = "levi,Eren,Mikasa, true , 200";
        String[] split = texto.split("\\d");
        for (String nome : split){
            System.out.println(nome.trim());
        }
    }
}
