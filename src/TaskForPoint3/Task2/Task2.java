package TaskForPoint3.Task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person(0L, "Viktor", LocalDate.of(2019, 1, 15));
        people[1] = new Person(1L, "German", LocalDate.of(2019, 1, 15));
        people[2] = new Person(2L, "Artyr", LocalDate.of(2019, 1, 15));

        System.out.println(Arrays.stream(people).filter((p)-> p.date.isAfter(LocalDate.of(2019, 06, 14))).findAny().orElse(null));
    }
}

