package TaskForPoint8.Task4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee("OP", 123);
        Person[] person = new Person[1];
        person[0] = new Person("Viktor", 21, employee);
        System.out.println(person);

        FileOutputStream fileOutputStream = new FileOutputStream("employee.tmp");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person);
    }
}
