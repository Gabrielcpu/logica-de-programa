package JavaCore.ZZHPadrõesdeProjeto.Teste;

import JavaCore.ZZHPadrõesdeProjeto.domino.Person;

public class BulderPatternTeste01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Gabriel")
                .lestName("Carvalho")
                .userName("Virado no jiraya")
                .email("gagalolo.@gmail.dev")
                .build();
        System.out.println(build);
    }
}
