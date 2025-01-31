package JavaCore.ZZgConcorencia.Teste;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class COunter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock(true);

    void increment() {
        lock.lock();
        try {
            count++;
            atomicInteger.incrementAndGet();
        }finally {
            lock.unlock();
        }

    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTeste01 {
    public static void main(String[] args) throws InterruptedException {
        COunter cOunter = new COunter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                cOunter.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cOunter.getCount());
        System.out.println(cOunter.getAtomicInteger());
    }
}
