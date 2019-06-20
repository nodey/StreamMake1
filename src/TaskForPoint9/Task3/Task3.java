package TaskForPoint9.Task3;

import java.lang.reflect.Method;

public class Task3 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        InterfaceMethods(employee);
    }

    public static void InterfaceMethods (Object object){
        Class[] interfacesOfClass = object.getClass().getInterfaces();
        if(interfacesOfClass.length != 0){
            for(int i=0; i < interfacesOfClass.length; i++){
                System.out.println("Methods of " + interfacesOfClass[i].getSimpleName() + " interface of class " + object.getClass().getSimpleName() + " are: ");
                Method[] interfaceMethod = interfacesOfClass[i].getDeclaredMethods();
                for(int j=0; j < interfaceMethod.length; j++)
                    System.out.println(" " + interfaceMethod[j]);
            }
        }
        else
            System.out.println("This class don't implements interface.");
    }
}
