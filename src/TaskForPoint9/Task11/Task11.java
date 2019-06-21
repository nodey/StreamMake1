package TaskForPoint9.Task11;

import java.lang.reflect.Field;

public class Task11 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PrivateField privateField = new PrivateField();

        Field field = privateField.getClass().getDeclaredField("age");

        field.setAccessible(true);
        field.setInt(privateField, 21);
        System.out.println(privateField);
    }
}
