package JavaCore.ZZFThreads.Teste;

import JavaCore.ZZFThreads.Dominio.Account;

public class ThreatAccountteste01 implements Runnable {
    private final Account account = new Account();
    public static void main(String[] args) {
        ThreatAccountteste01 threatAccountteste01 = new ThreatAccountteste01();
        Thread t1 = new Thread(threatAccountteste01," hestia ");
        Thread t2 = new Thread(threatAccountteste01," bell Cranel ");
        t1.start();
        t2.start();
    }
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                withdrawal(10);
                if (account.getBalance() < 0){
                    System.out.println("fedeu");
                }
            }
        }


    private void withdrawal(int amount){
        System.out.println(getThreadName()+"###### fora do  synchronized");
        synchronized (account){
            System.out.println(getThreadName()+"***** dentro do  synchronized");
        if (account.getBalance() >= amount){
            System.out.println(getThreadName() +"está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() +"completou o saque, valor atual da conta "+account.getBalance());
        }else {
            System.out.println("sem dinehiro para "+ getThreadName() +"efetual o saque"+ account.getBalance());
        }
    }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }


}
