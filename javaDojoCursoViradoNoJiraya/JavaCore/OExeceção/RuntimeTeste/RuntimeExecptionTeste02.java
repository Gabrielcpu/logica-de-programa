package JavaCore.OExeceção.RuntimeTeste;

public class RuntimeExecptionTeste02 {
    public static void main(String[] args) {
           divisao(2, 8);

        System.out.println("Codigo finalizado ");
    }

    /**
     *
     * @param a
     * @param b  não poder ser zero
     * @return
     * @throws IllegalArgumentException caso o resultado seja zero
     */
    private static int divisao(int a, int b) {
        if ( b == 0) {
            throw new IllegalArgumentException("argumento ilegal , nao pode ser 0");
        }
            return a / b;
    }
}
