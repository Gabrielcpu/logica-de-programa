package JavaCore.ZZgConcorencia.Teste;

import JavaCore.ZZgConcorencia.Service.StoreService;
import JavaCore.ZZgConcorencia.Service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTEste03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }
    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
    long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10,r ->{
            Thread thread =new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> store = List.of("Store1","Store2","Store3","Store4");
        List<CompletableFuture<Double>> completableFutures = store.stream().
                map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s),executor))
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());


        System.out.println(prices);
        long end = System.currentTimeMillis();
        executor.shutdown();
    System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    StoreService.shutdown();

}
}
