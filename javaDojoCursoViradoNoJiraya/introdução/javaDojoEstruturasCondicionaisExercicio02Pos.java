package introdução;

public class javaDojoEstruturasCondicionaisExercicio02Pos {
    public static void main(String[] args) {
        //utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
        //considerando 1 como domingo
        byte dia = 5;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("esse dia é inexistente");
                break;
        }

    }
}
