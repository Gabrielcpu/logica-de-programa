package JavaCore.ZZHPadrõesdeProjeto.Teste;

import JavaCore.ZZHPadrõesdeProjeto.domino.*;

public class DataTransferObjectTeste01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRASIL;
        Currency currency = CurrencyFactory.newcurrency(country);
        Person person = Person.PersonBuilder
                .aPerson()
                .firstName("Gabriel")
                .lestName("Carvalho")
                .build();
        ReportDTO reportDto = ReportDTO.ReportDTOBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .persoName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
