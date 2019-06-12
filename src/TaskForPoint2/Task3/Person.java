package TaskForPoint2.Task3;

import java.time.LocalDateTime;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private boolean logged = true;

    //constructor for add any parameter with localDateTime parameter
    public Person(String firstName, String lastName, LocalDateTime of) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = of;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = lastName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime of) {
        this.createdAt = of;
    }

    @Override
    public String toString() {
        return  "firstName: " + firstName + '\'' +
                ", lastName: " + lastName + '\'' +
                ", createdAt: " + createdAt +
                ", logged: " + logged;
    }
}
