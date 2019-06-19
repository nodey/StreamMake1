package TaskForPoint3.Task10;

import java.time.LocalDate;

public class Person {

    private Long id;
    private String name;
    LocalDate date;

    public Person(Long id, String name, LocalDate of) {
        this.id = id;
        this.name = name;
        this.date = of;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
