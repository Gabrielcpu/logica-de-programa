package JavaCore.ZZgConcorencia.Service;


import JavaCore.ZZgConcorencia.Dominio.Member;

public class EmilDeliverysService implements Runnable{
    private final Member members;

    public EmilDeliverysService(Member members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+"starling to deliver emails...");
        while (members.isopen()|| members.pendingEmails() > 0){
            try {
                String email = members.retriveEmail();
                if (email == null) continue;
                System.out.println(threadName+ "enviando email para "+email);
                Thread.sleep(2000);
                System.out.println(threadName+"enviou email com sucesso para"+email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("todos os emails foram enviado com sucesso");
    }
}
