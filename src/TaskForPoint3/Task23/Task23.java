package TaskForPoint3.Task23;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task23 {
    public static void main(String[] args) {
        Person[] persons = new Person[7];
        persons[0] = new Person(0L, "Vasya", true);
        persons[1] = new Person(1L, "Pasha", false);
        persons[2] = new Person(2L, "Viktor", true);
        persons[3] = new Person(3L, "Atryr", false);
        persons[4] = new Person(4L, "Atryr", true);
        persons[5] = new Person(5L, "Atryr", false);
        persons[6] = new Person(6L, "Atryr", false);

        Stream<Person> personStream = Arrays.stream(persons);
        System.out.println(personStream.collect(Collectors.partitioningBy(Person::getLogged)));
    }
}
