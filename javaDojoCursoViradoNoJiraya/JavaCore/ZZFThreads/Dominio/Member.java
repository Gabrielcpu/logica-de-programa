package JavaCore.ZZFThreads.Dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Member {
    private final Queue<String> emals = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isopen() {
        return open;
    }

    public int pendinfEmails() {
        synchronized (emals) {
            return emals.size();
        }
    }

    public void addMenberEmail(String email) {
        synchronized (this.emals) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emals.add(email);
            this.emals.notifyAll();
        }
    }

    public String retriveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "checking if there are emails");
        synchronized (this.emals) {
            while (this.emals.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + "Não tem email disponivel na lista, entrando em modo de espera");
                this.emals.wait();
            }
            return this.emals.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emals) {
            System.out.println(Thread.currentThread().getName() + "Notificando todo mundo nao estamos mais pegando emails ");
       this.emals.notifyAll();
        }
    }
}
