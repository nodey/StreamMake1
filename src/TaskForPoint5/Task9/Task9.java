package TaskForPoint5.Task9;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Task9 {
    public static void main(String[] args) {
        LocalDateTime n = LocalDateTime.now(ZoneId.of("Europe/Minsk"));
        System.out.println(n.toString() + " " + "for EUROPE/MINSK");
    }
}
