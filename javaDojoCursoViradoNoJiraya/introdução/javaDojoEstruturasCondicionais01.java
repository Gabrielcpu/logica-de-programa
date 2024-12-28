package introdução;

public class javaDojoEstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean casoSejaAutorizado = idade >= 18;
        // !
        if (casoSejaAutorizado) {
            System.out.println("você pode pegar bebida");
        }else{
            System.out.println("você nao pode pehar a bebida");
        }
        if (! casoSejaAutorizado){
            System.out.println("você nao pode pehar a bebida");
        }
        boolean c = false;
        if(c==true){
            System.out.println("isso nunca deve ser feito");
        }
    }
}
