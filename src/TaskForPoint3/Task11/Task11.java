package TaskForPoint3.Task11;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person(0L, "admin", LocalDate.of(2019, 12, 12)),
                new Person(0L, "admin", LocalDate.of(2019, 12, 12)),
                new Person(0L, "admin", LocalDate.of(2019, 12, 12)));
        System.out.println(personList.stream().allMatch(person -> person.getDate().isBefore(LocalDate.of(2019, 12, 31)) && person.getDate().isAfter(LocalDate.of(2019, 01, 01))));


    }
}
