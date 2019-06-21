package TaskForPoint9.Task10;

import java.lang.reflect.Field;

public class Task10 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PrivateField privateField = new PrivateField("name", 12);

        Field field = privateField.getClass().getDeclaredField("age");
        field.setAccessible(true);

        System.out.println(field.getInt(privateField));
    }
}
