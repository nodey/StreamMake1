package TaskForPoint3.Task9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task9 {
    public static void main(String[] args) {
        Person[] strings = new Person[3];
        strings[0] = new Person(0L, "Nunu", LocalDate.of(2016, 12, 12));
        strings[1] = new Person(0L, "Aatrox", LocalDate.of(2019, 12, 12));
        strings[2] = new Person(0L, "Ezreal", LocalDate.of(2016, 12, 12));

        Stream<Person> streams = Arrays.stream(strings);

        List<Person> personList = new ArrayList<Person>(Arrays.asList(strings));
        System.out.println(personList.stream().filter(person -> person.getDate().isBefore(LocalDate.of(2019, 12, 31))).filter(person -> person.getDate().isAfter(LocalDate.of(2019, 01, 01))).count());

    }
}