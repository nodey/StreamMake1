package TaskForPoint5.Task13;

import java.time.LocalDate;
import java.time.Period;

public class Task13 {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(1998, 04, 16);

        calculatePeriod(startDate, endDate);

    }

    static void calculatePeriod(LocalDate startDate,
                                LocalDate endDate)
    {
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between start and end "
                + "date is : " + period);
    }
}
