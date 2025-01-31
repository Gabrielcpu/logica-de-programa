package JavaCore.ZZgConcorencia.Teste;

import JavaCore.ZZgConcorencia.Service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTeste01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
      //  searchPricesSync(storeService);
       // searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("store 1"));
        System.out.println(storeService.getPriceSync("store 2"));
        System.out.println(storeService.getPriceSync("store 3"));
        System.out.println(storeService.getPriceSync("store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture0 = storeService.getPricesAsyncFuture("store 1");
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("store 2");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("store 3");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("store 4");
        try {
            System.out.println(pricesAsyncFuture0.get());
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();

    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture0 = storeService.getPricesAsynccompletableFuture("store 1");
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAsynccompletableFuture("store 2");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAsynccompletableFuture("store 3");
        CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAsynccompletableFuture("store 4");

            System.out.println(pricesAsyncFuture0.join());
            System.out.println(pricesAsyncFuture1.join());
            System.out.println(pricesAsyncFuture2.join());
            System.out.println(pricesAsyncFuture3.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();

    }
}
