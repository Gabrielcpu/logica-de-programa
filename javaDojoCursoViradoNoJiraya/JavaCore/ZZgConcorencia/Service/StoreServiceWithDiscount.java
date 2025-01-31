package JavaCore.ZZgConcorencia.Service;

import JavaCore.ZZgConcorencia.Dominio.DIscount;
import JavaCore.ZZgConcorencia.Dominio.Quote;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    public String getPriceSync(String storeName) {
       double price =  priceGenerator();
        DIscount.Code discountCode = DIscount.Code.values()[ThreadLocalRandom.current().nextInt(DIscount.Code.values().length)];
        return  String.format(Locale.US,"%s:%.2f:%s",storeName, price, discountCode);
    }
    public String applyDIscount(Quote quote){
        deplay();
        double discontValue = quote.getPrice() * (100 - quote.getDiscountCOde().getPercentage()) / 100;
        return  String.format("'%s' origenal price: '%.2f'.Applying discount code '%s'.final price; '2.2f'",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCOde(),
                discontValue);
    }

    private double priceGenerator() {
        deplay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void deplay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(200,2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
