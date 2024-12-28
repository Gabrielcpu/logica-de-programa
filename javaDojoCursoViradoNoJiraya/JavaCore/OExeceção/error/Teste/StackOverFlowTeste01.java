package JavaCore.OExeceção.error.Teste;

public class StackOverFlowTeste01 {
    public static void main(String[] args) {
Recursivo();
    }
    public static void Recursivo(){
        Recursivo();
    }
}
