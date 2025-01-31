package JavaCore.ZZgConcorencia.Dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Member {
    private final Queue<String> emals = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isopen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emals.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMenberEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emals.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retriveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "checking if there are emails");
        lock.lock();
        try  {
            while (this.emals.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + "Não tem email disponivel na lista, entrando em modo de espera");
                condition.await();
            }
            return this.emals.poll();
        }finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "Notificando todo mundo nao estamos mais pegando emails ");
        condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
