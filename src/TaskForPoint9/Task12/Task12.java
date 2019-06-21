package TaskForPoint9.Task12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task12 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        PrivateField privateField = new PrivateField("name", 12);

        Method method = privateField.getClass().getDeclaredMethod("toString");
        method.setAccessible(true);
        System.out.println(method.invoke(privateField));
    }
}
