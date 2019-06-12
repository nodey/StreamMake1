package TaskForPoint2.Task2;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//Using conveyor methods
//Filter of array by date
class FilterOfArraysByLocalDateTime {
    public static void main(String[] args){
        Collection<Task2> personList = Arrays.asList(new Task2("Ivan", "Ivanov", LocalDateTime.of(2019, 01, 15, 05, 17, 53)),
                new Task2("Alex", "Alex", LocalDateTime.of(2019, 04, 8, 10, 55, 26)),
                new Task2("Peter", "Peter", LocalDateTime.of(2019, 03, 29, 12, 03, 8)));
        List<Task2> personList1 = personList.stream().filter((p)-> p.getCreatedAt().isBefore(LocalDateTime.of(2019, 02, 27, 02, 30, 31))).collect(Collectors.toList());
        System.out.println(personList1);
    }
}


//class for work with array of objects
public class Task2{

    //Parameters for array
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;

    //constructor for add any parameter with localDateTime parameter
    public Task2(String firstName, String lastName, LocalDateTime of) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = of;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = lastName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime of) {
        this.createdAt = of;
    }

    @Override
    public String toString() {
        return "Task2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}