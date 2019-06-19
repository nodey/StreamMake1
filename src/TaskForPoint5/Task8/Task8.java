package TaskForPoint5.Task8;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Task8 {
    public static void main(String[] args) {
        LocalDateTime n = LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println(n.toString() + " " + "for UTC");

    }
}
