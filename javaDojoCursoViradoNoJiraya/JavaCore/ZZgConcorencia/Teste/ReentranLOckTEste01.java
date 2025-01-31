package JavaCore.ZZgConcorencia.Teste;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.printf(" Thread %s entrou em uma sessão critica%n", name);
            System.out.printf("%d Thread esperando na fila%n", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera%n", name);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
                lock.unlock();
        }
    }
}

public class ReentranLOckTEste01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker(lock, "A")).start();
        new Thread(new Worker(lock, "B")).start();
        new Thread(new Worker(lock, "C")).start();
        new Thread(new Worker(lock, "D")).start();
        new Thread(new Worker(lock, "E")).start();
        new Thread(new Worker(lock, "F")).start();
        new Thread(new Worker(lock, "G")).start();

    }
}
