package JavaCore.RDatas.Teste;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokioZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokioZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokioZone);
        System.out.println(zonedDateTime);

        Instant instantnow =Instant.now();
        System.out.println(instantnow);
        ZonedDateTime zonedDateTime1 = instantnow.atZone(tokioZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset zoneOffManaus = ZoneOffset.of("-04:00");
        ZonedDateTime zonedDateTime3 = now.atZone(zoneOffManaus);
        System.out.println(zonedDateTime3);
        OffsetDateTime offsetDateTime4 = OffsetDateTime.of(now, zoneOffManaus);
        System.out.println(offsetDateTime4);

        OffsetDateTime offsetDateTime5 = instantnow.atOffset(zoneOffManaus);
        System.out.println(offsetDateTime5);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEra = LocalDate.of(1900, 2, 1);
        JapaneseDate from = JapaneseDate.from(meijiEra);
        System.out.println(from);

    }
}
