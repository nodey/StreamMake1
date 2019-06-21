package TaskForPoint9.Task7;

import TaskForPoint9.Task5.Employee;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Task7 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Task7.MethodList(employee);
    }

    public static void MethodList(Object object){
        Method[] methods = object.getClass().getDeclaredMethods();

        for(Method method : methods){
            if(Modifier.isPublic(method.getModifiers()))
                System.out.println(" " + method);
        }

        for(Method method : methods){
            if(Modifier.isPrivate(method.getModifiers()))
                System.out.println(" " + method);
        }
    }
}
