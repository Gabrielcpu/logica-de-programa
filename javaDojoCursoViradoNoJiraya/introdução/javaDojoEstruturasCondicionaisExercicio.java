package introdução;

public class javaDojoEstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAno = 70000;
        double imposto1 = 9.70;
        double imposto2 = 37.35;
        double imposto3 = 49.50;
        double valorFinal;
        if (salarioAno <= 34712){
            valorFinal = salarioAno * (imposto1/ 100);
        } else if (salarioAno <= 34712 && salarioAno <= 68507 ) {
            valorFinal = salarioAno * (imposto2/100);
        }else{ valorFinal = salarioAno * (imposto3/100);}
        System.out.println(valorFinal);

    }
}
