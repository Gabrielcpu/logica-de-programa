package JavaCore.ZZgConcorencia.Teste;

import JavaCore.ZZgConcorencia.Dominio.Quote;
import JavaCore.ZZgConcorencia.Service.StoreServiceWithDiscount;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTeste05 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDIscountAsync(service);
    }


    private static  void searchPricesWithDIscountAsync(StoreServiceWithDiscount service ){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1","Store2","Store3","Store4");

        CompletableFuture[] completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQUate))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDIscount(quote))))
                .map(cf -> cf.thenAccept(string -> System.out.printf("%s finished in %d%n", stores, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

      //  CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("finished %b%n",voidCompletableFuture.isDone());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));

    }
}
