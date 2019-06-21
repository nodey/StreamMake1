package TaskForPoint9.Task6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Employee employee = new Employee("name", 12, 183.3) ;
        Task6.MethodInvoke(employee);
    }

    public static void MethodInvoke(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner cin = new Scanner(System.in);
        Method[] methods1 = object.getClass().getDeclaredMethods();
        for(Method method: methods1){
            System.out.println("   "+method);
        }
        String tempName = cin.nextLine();
        Method choosenMethod = object.getClass().getDeclaredMethod(tempName);
        choosenMethod.setAccessible(true);
        choosenMethod.invoke(object);
    }
}