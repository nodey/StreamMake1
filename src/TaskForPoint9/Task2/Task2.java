package TaskForPoint9.Task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Task2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        ToGetAllInformation(employee);

    }

    public static void ToGetAllInformation(Object object){
        System.out.println("My class: " + Modifier.toString(object.getClass().getModifiers()) + "mod");

        Field[] fields = object.getClass().getDeclaredFields();
        System.out.println("Fields: ");
        for(int i = 0; i < fields.length; i++){
            System.out.println(" " + fields[i]);
        }

        Method[] methods = object.getClass().getDeclaredMethods();
        System.out.println("Methods: ");
        for(int i = 0; i < methods.length; i++){
            System.out.println(" " + methods[i]);
        }

        Constructor[] constructors = object.getClass().getConstructors();
        System.out.println("Constructors: ");
        for(int i = 0; i < constructors.length; i++){
            System.out.println(" " + constructors[i]);
        }

        System.out.println("Super class:");
        System.out.println(" " + object.getClass().getSuperclass());
    }
}
