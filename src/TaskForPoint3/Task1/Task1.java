package TaskForPoint3.Task1;

import java.time.LocalDate;
import java.util.*;

public class Task1 {
    public static void main(String[] args){
        Person[] people = new Person[3];
        people[0] = new Person(0L, "Viktor", LocalDate.of(2019, 12, 15));
        people[1] = new Person(1L, "German", LocalDate.of(2019, 12, 15));
        people[2] = new Person(2L, "Artyr", LocalDate.of(2019, 12, 15));

        System.out.println(Arrays.stream(people).filter(person -> person.name.contains("Viktor")).findFirst().orElse(new Person(0L, "Vitya", LocalDate.of(2019, 11, 15))));
    }
}



