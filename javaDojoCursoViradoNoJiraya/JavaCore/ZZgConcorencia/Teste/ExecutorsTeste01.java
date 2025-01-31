package JavaCore.ZZgConcorencia.Teste;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Ptinter implements Runnable {
    private final int num;

    Ptinter(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        System.out.printf("%s inicio: %s%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finalizou: %n", Thread.currentThread().getName());

    }
}

public class ExecutorsTeste01 {
    public static void main(String[] args) {
      //  System.out.println(Runtime.getRuntime().availableProcessors());
     //   ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
     //   ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Ptinter(1));
        executorService.execute(new Ptinter(2));
        executorService.execute(new Ptinter(3));
        executorService.execute(new Ptinter(4));
        executorService.shutdown();

        System.out.println(" o programa foi finalizado");
    }
}
