package TaskForPoint9.Task5;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee();
        FieldSetter(employee);
        System.out.println(employee);
    }

    public static void FieldSetter(Object object) throws NoSuchFieldException, IllegalAccessException {
        Scanner cin = new Scanner(System.in);
        System.out.println("Please, choose the field that you need: ");
        Field[] fields1 = object.getClass().getDeclaredFields();
        for(Field field:fields1){
            System.out.println(" " + field);
        }

        System.out.println("Your choise: ");
        String tempName = cin.nextLine();
        Field choosenField = object.getClass().getDeclaredField(tempName);
        choosenField.setAccessible(true);
        System.out.println("The value of the field \" " + tempName + "\" is: " + choosenField.get(object));
        System.out.println("Please, enter the new value: ");
        String value = cin.nextLine();

        Type type = choosenField.getType();
        String typeString = type.getTypeName();
        switch (typeString){
            case "int":
                choosenField.setInt(object, Integer.parseInt(value));
                break;
            case "java.lang.String":
                choosenField.set(object, value);
                break;
        }

        System.out.println("The value of the field \""+tempName+"\" is: "+choosenField.get(object)+" now.");
    }
}
