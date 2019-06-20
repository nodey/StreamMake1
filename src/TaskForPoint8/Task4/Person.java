package TaskForPoint8.Task4;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private Employee employee;

    public Person(String name, int age, Employee employee) {
        this.name = name;
        this.age = age;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Person{" +
                "employee=" + employee +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
