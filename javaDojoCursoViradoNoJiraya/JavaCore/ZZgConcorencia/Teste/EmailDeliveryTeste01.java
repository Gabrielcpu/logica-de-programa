package JavaCore.ZZgConcorencia.Teste;


import JavaCore.ZZgConcorencia.Dominio.Member;
import JavaCore.ZZgConcorencia.Service.EmilDeliverysService;

import javax.swing.*;

public class EmailDeliveryTeste01 {
    public static void main(String[] args) {
        Member members = new Member();
        Thread jiraya = new Thread(new EmilDeliverysService(members), "Jiraya");
        Thread kakashi = new Thread(new EmilDeliverysService(members), "Kakashi");
        jiraya.start();
        kakashi.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMenberEmail(email);
        }
    }
}
