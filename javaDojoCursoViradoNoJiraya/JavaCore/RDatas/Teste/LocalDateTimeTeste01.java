package JavaCore.RDatas.Teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-01-06");
        LocalTime time = LocalTime.parse("09:45:21");
        System.out.println(ldt);
        System.out.println(date);
        System.out.println(time);
       LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
