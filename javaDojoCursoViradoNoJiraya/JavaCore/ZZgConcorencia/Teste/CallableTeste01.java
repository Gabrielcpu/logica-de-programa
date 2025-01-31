package JavaCore.ZZgConcorencia.Teste;

import java.util.concurrent.*;

class ReandorNumbeerCAllable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa collable...%n", Thread.currentThread().getName());
        }
        return String.format("%s finshed and the random number is %d", Thread.currentThread().getName(), num);
    }
}

public class CallableTeste01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ReandorNumbeerCAllable reandorNumbeerCAllable = new ReandorNumbeerCAllable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(reandorNumbeerCAllable);
        String s = future.get();
        System.out.printf("programa finished %S", s);
        executorService.shutdown();
    }
}
