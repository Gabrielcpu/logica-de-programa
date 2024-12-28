package JavaCore.RDatas.Teste;

import java.util.Date;

public class DataTeste01 {
    public static void main(String[] args) {
        Date data = new Date(1736108850448l);// long 10000000
        data.setTime(data.getTime()+ 3_600_000);
        System.out.println(data);
    }
}
