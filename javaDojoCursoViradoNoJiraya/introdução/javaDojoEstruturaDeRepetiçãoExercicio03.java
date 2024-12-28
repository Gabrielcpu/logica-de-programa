package introdução;

public class javaDojoEstruturaDeRepetiçãoExercicio03 {
    public static void main(String[] args) {
    //dado o valor do um, carro descubra em quantas vezes ele pode ser parcelado
    // a quandição é que o valor da parcela tem que ser >= 1000
    int ValorTotal = 40000;
        for (int parcelas = ValorTotal; parcelas >= 1 ; parcelas--) {
            double ValorPArcela = ValorTotal / parcelas;
            if (ValorPArcela < 1000) {
                continue;
            }
            System.out.println("parcela " + parcelas + " R$= " + ValorPArcela);
        }
    }
}

