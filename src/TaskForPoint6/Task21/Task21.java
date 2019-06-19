package TaskForPoint6.Task21;

import java.io.IOException;
import java.time.ZoneId;
import java.util.TimeZone;

public class Task21 {
    public static void main(String[] args) throws IOException {
        TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of("Europe/Minsk"));
        System.out.println(timeZone);
    }
}
