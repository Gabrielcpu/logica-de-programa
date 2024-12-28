package introdução;

public class javaDojoEstruturasCondicionais02 {
    public static void main(String[] args) {
        /* idade < 15 categoria infantil
          idade >= 15 && idade < 18 categoria juvenil
           idade >=18 categoria adulta
        */
        int idade = 20;
        String categoria;
        if(idade< 15){
            categoria = "você é da categoria infantil";
        } else if (idade >=15 && idade < 18) {
            categoria = "você é da categoria juvenil";
        } else {
            categoria = "você é da categoria adulta";
        }
        System.out.println(categoria);
    }
}
