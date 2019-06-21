package TaskForPoint9.Task8;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Task8 {
    public static void main(String[] args) {

    }

    public static void FieldsList(Object object){
        Field[] fields = object.getClass().getDeclaredFields();

        for(Field field: fields){
            if(Modifier.isPublic(field.getModifiers()))
                System.out.println(" " + field);
        }

        for(Field field: fields){
            if(Modifier.isPrivate(field.getModifiers()))
                System.out.println(" " + field);
        }
    }
}
