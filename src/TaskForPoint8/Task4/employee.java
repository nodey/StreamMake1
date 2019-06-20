package TaskForPoint8.Task4;

import java.io.Serializable;

public class Employee implements Serializable {
    private String firstName;
    private int sizeOfBoots;

    public Employee(String firstName, int sizeOfBoots) {
        this.firstName = firstName;
        this.sizeOfBoots = sizeOfBoots;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getSizeOfBoots() {
        return sizeOfBoots;
    }

    public void setSizeOfBoots(int sizeOfBoots) {
        this.sizeOfBoots = sizeOfBoots;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", sizeOfBoots=" + sizeOfBoots +
                '}';
    }
}
