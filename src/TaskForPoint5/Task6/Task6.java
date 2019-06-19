package TaskForPoint5.Task6;

import java.text.ParseException;
import java.time.LocalTime;

public class Task6 {
    public static void main(String[] args) throws ParseException {
        String s = "20:15:30";
        LocalTime n = LocalTime.parse(s);
        System.out.println(n);
    }

}
