package TaskForPoint2.Task8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        Collection<Person> personList = Arrays.asList(new Person("1", LocalDate.of(2001, 11, 03)),
                new Person("1.txt", LocalDate.of(2001, 11, 03)),
                new Person("1_outdated.txt", LocalDate.of(2001, 11, 03)),
                new Person("1", LocalDate.of(2021, 11, 03)));
        List<Person> personList1 = personList.stream().filter((s)-> s.getDate().isBefore(LocalDate.of(2019, 06, 12)) && s.getName().contains("1")).collect(Collectors.toList());
        System.out.println(personList1);
    }
}
