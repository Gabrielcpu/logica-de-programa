package JavaCore.OExeceção.RuntimeTeste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexoes();
    }

    private static String abreConexoes() {
        try {
            System.out.println("abrindo o arquivo ");
            System.out.println("escrevendo dados no arquivo ");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando o recurso do SO ");
        }
        return null;
    }

    private static void abreConexoes2() {
        try {
            System.out.println("abrindo o arquivo ");
            System.out.println("escrevendo dados no arquivo ");
        } finally {
            System.out.println("fechando o recurso do SO ");
        }
    }
}
