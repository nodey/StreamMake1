package TaskForPoint3.Task10;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person(0L, "admin", LocalDate.of(2012, 12, 12)));

        System.out.println(personList.stream().anyMatch(person -> person.getName().contains("admin")));
    }
}
