package TaskForPoint8.Task2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Task2 {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\maven/person.dat")))
        {
            Employee employee = new Employee("Samuel", "Samuiela");
            Person p = new Person("Sam", 33, 178, true, employee);
            oos.writeObject(p);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
