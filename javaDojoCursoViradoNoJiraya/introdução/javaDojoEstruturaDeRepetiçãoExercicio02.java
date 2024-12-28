package introdução;

public class javaDojoEstruturaDeRepetiçãoExercicio02 {
    public static void main(String[] args) {
        //dado o valor do um, carro descubra em quantas vezes ele pode ser parcelado
        // a quandição é que o valor da parcela tem que ser >= 1000
        int ValorTotal = 40000;
        int ValorMinimoPArcela = 1000;
        int maxParcela =0;
        for (int parcelas = 1; parcelas <= ValorTotal ; parcelas++) {
            double  ValorPArcela = ValorTotal / parcelas;
            if (ValorPArcela < ValorMinimoPArcela){
                break;
            }
            System.out.println("parcela "+ parcelas+" R$= "+ValorPArcela);
        }
    }
}
