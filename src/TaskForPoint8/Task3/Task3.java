package TaskForPoint8.Task3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Person[] persons = new Person[1];
        persons[0] = new Person("Viktor", 21);

        FileOutputStream fileOutputStream = new FileOutputStream("employee.tmp");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(persons);

    }
}
