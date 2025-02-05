package JavaCore.ZZHPadrõesdeProjeto.domino;

public interface Currency {
    String getSymbol();
}
class Real implements Currency {

    @Override
    public String getSymbol() {
        return "R$";
    }
}
class USDolar implements Currency {

    @Override
    public String getSymbol() {
        return "$";
    }
}
