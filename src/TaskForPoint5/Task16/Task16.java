package TaskForPoint5.Task16;

import java.time.*;

public class Task16 {
    public static void main(String[] args) {
        ZonedDateTime utcZoned = ZonedDateTime.now(ZoneOffset.UTC);
        ZoneId swissZone = ZoneId.of("Europe/Minsk");
        ZonedDateTime swissZoned = utcZoned.withZoneSameInstant(swissZone);
        LocalDateTime swissLocal = swissZoned.toLocalDateTime();
        System.out.println(swissLocal);
    }
}
