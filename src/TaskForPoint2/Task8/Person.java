package TaskForPoint2.Task8;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate of) {
        this.date = of;
    }

    public Person(String name, LocalDate of) {
        this.name = name;
        this.date = of;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
