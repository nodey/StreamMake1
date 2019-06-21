package TaskForPoint9.Task13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Task13 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        PrivateField privateField = null;

        Constructor<PrivateField> constructor= (Constructor<PrivateField>) PrivateField.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        PrivateField obj = constructor.newInstance("Daniel", 12);
        System.out.println(obj);
    }
}
