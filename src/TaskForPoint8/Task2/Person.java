package TaskForPoint8.Task2;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private double height;
    private boolean married;
    private Employee employee;

    public Person(String name, int age, double height, boolean married, Employee employee) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
        this.employee = employee;
    }

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
