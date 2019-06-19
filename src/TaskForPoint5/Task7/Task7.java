package TaskForPoint5.Task7;

import java.time.ZonedDateTime;

public class Task7 {
    public static void main(String[] args) {
        String s = "2007-12-03T10:15:30+03:00";
        ZonedDateTime n = ZonedDateTime.parse(s);
        System.out.println(n);
    }
}
