package TaskForPoint4.Task4;

import java.time.LocalDate;
import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        LocalDate localDate;
        Consumer<LocalDate> localDateConsumer = x-> System.out.println(x);
        localDateConsumer.accept(LocalDate.now());
    }
}
