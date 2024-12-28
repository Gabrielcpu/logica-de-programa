package introdução;

public class javaDojoArrys02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double o valor é = 0
        // char '\u0000'
        //boolean false or true
        // String null
        String[] nomes = new String[3];
        nomes[0] = "Goku" ;
        nomes[1] = "dandadan";
        nomes[2] = "kurosaki";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
