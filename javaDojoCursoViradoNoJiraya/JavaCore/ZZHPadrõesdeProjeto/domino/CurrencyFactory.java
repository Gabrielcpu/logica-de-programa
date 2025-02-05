package JavaCore.ZZHPadrõesdeProjeto.domino;

public class CurrencyFactory {
    public static Currency newcurrency(Country country){
        switch (country){
            case USA:
                return new USDolar();
            case BRASIL:return new Real();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
