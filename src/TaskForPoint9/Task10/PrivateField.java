package TaskForPoint9.Task10;

public class PrivateField {
    private String name;
    private int age;

    public PrivateField(String name, int age) {
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
