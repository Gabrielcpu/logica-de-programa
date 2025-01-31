package JavaCore.ZZgConcorencia.Teste;

import java.util.concurrent.*;

public class LinkedTransferQueueTeste01 {
    public static void main(String[] args) throws InterruptedException {
   //     ConcurrentLinkedQueue, SynchronousQueue, LinkedblockQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Gabriel"));
        System.out.println(tq.offer("Carvalho"));
        System.out.println(tq.offer("Carvalho",10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if (tq.hasWaitingConsumer()){
        tq.transfer("DevDojo");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy",5,TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
