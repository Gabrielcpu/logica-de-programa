package JavaCore.ZZHPadrõesdeProjeto.Teste;

import JavaCore.ZZHPadrõesdeProjeto.domino.Country;
import JavaCore.ZZHPadrõesdeProjeto.domino.Currency;
import JavaCore.ZZHPadrõesdeProjeto.domino.CurrencyFactory;

public class CurrencyFactoryTeste01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newcurrency(Country.BRASIL);
        System.out.println(currency.getSymbol());
    }
}
