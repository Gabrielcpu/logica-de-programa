package introdução;

public class javaDojoEstruturasCondicionais04Posexercicio {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 7;
        // char, int, byte , short, enum , string
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opção invalida");

        }
        char sexo = 'm';
        switch (sexo){
            case 'm':
                System.out.println("homem");
                break;
            case 'f':
                System.out.println("mulher");
                break;
            default:
                System.out.println("invalido");
                break;
        }
    }
}
