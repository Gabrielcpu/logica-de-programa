package JavaCore.ZZgConcorencia.Service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {

    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices sync for stare %s%n", storeName);
        return priceGenerator();
    }

    private double priceGenerator() {
        System.out.printf(" generating price %n" + Thread.currentThread().getName());
        deplay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void deplay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
