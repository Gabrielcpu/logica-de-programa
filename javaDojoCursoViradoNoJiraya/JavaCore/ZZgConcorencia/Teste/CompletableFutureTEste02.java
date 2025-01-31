package JavaCore.ZZgConcorencia.Teste;

import JavaCore.ZZgConcorencia.Service.StoreService;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTEste02 {
    public static void main(String[] args) {
StoreService storeService = new StoreService();
searchPricesAsyncCompletableFuture(storeService);
    }
    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
    long start = System.currentTimeMillis();
        List<String> store = List.of("Store1","Store2","Store3","Store4");
        List<CompletableFuture<Double>> completableFutures = store.stream()
                .map(storeService::getPricesAsynccompletableFuture)
                .collect(Collectors.toList());

        List<Double> collect = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(collect);
        long end = System.currentTimeMillis();
    System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    StoreService.shutdown();

}
}
