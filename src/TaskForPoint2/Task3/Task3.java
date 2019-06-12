package TaskForPoint2.Task3;

import TaskForPoint2.Task2.Task2;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
        public static void main(String[] args){
            Collection<Person> personList = Arrays.asList(new Person("Ivan", "Ivanov", LocalDateTime.of(2019, 01, 15, 05, 17, 53)),
                    new Person("Alex", "Alex", LocalDateTime.of(2019, 04, 8, 10, 55, 26)),
                    new Person("Peter", "Peter", LocalDateTime.of(2019, 03, 29, 12, 03, 8)));
            List<Person> personList1 = personList.stream().filter((p)-> p.getCreatedAt().isBefore(LocalDateTime.of(2019, 02, 27, 02, 30, 31))).collect(Collectors.toList());
            System.out.println(personList1);
        }
}
