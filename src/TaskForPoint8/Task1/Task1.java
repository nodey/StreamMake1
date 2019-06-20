package TaskForPoint8.Task1;

import TaskForPoint8.Task2.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Task1 {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\maven/person.dat")))
        {
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
