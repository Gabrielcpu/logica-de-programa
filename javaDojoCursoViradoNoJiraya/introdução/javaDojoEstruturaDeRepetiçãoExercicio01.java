package introdução;

public class javaDojoEstruturaDeRepetiçãoExercicio01 {
    public static void main(String[] args) {
        //imprima todos os numeros par de 1 a 100000
        int contador = 0;
        for (int n = 1;n <=1000000;n++){
            if (n % 2== 0){
                // ou posso usar sout so para ver os numeros par
                contador++;
            }
        }
        System.out.println("foram escontrados "+contador+" vezes");
    }
}
