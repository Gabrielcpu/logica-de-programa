package JavaCore.AIntroduçãoClasses.teste;

import JavaCore.AIntroduçãoClasses.Dominio.Carro;

public class CarroTesteExercicio {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "skyline R34";
        carro01.modelo ="nissan";
        carro01.ano = 1998;

        carro02.nome = "corolla";
        carro02.modelo = "toyota";
        carro02.ano = 2024;
        // é possivel fazer referença a omesmo objeto somente usando
        carro02 = carro01;
        // devido ter o ponto de referença eu ainda posso voltar a colocar o valor das variaveis anteriores

        System.out.println("o primeiro carro é o "+carro01.nome+" do modelo "+carro01.modelo+" do ano "+carro01.ano);
        System.out.println("o segundo carro é o "+carro02.nome+" do modelo "+carro02.modelo+" do ano "+carro02.ano);


    }
}
