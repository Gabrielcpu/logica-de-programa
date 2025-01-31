package JavaCore.ZZgConcorencia.Dominio;

public class Quote {
    private final String store;
    private final double price;
    private final DIscount.Code discountCOde;

    public Quote(DIscount.Code discountCOde, String store, double price) {
        this.discountCOde = discountCOde;
        this.store = store;
        this.price = price;
    }

    /**
     * Creastes new quate object from  the value following the patter Storenome:price:discontCode
     * @param value contening StoreNome:price:discontCode
     * @return new Quote with value from @parom value
     */
    public static  Quote newQUate(String value){
        String[] values = value.split(":");
        return new Quote(DIscount.Code.valueOf(values[2]), values[0], Double.parseDouble(values[1]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "discountCOde=" + discountCOde +
                ", store='" + store + '\'' +
                ", price=" + price +
                '}';
    }

    public DIscount.Code getDiscountCOde() {
        return discountCOde;
    }

    public double getPrice() {
        return price;
    }

    public String getStore() {
        return store;
    }
}
