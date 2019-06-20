package TaskForPoint9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("name of class: " + TakeObjectClass(person).getSimpleName());
    }

    public static Class TakeObjectClass(Object object){
        return object.getClass();
    }
}
