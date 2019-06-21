package TaskForPoint9.Task13;

public class PrivateField {
    private String name;
    private int age;

    private PrivateField(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PrivateField{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
