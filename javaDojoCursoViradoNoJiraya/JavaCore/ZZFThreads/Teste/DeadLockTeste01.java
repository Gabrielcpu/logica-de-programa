package JavaCore.ZZFThreads.Teste;

public class DeadLockTeste01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
Runnable r1 = () -> {
    synchronized (lock1){
        System.out.println("thread 1 :Segurando lock1");
        System.out.println("thread 1 :wsperando lock2");
        synchronized (lock2){
            System.out.println("thread 1 : segurando lock2");
        }
    }
};
        Runnable r2 = () -> {
            synchronized (lock2){
                System.out.println("thread 2 :Segurando lock2");
                System.out.println("thread 2 :wsperando lock1");
                synchronized (lock1){
                    System.out.println("thread 2 : segurando lock2");
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();

    }
}
