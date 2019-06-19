package TaskForPoint3.Task23;

public class Person {
    private Long id;
    private String name;
    private Boolean logged;

    public Person(Long id, String name, Boolean logged) {
        this.id = id;
        this.name = name;
        this.logged = logged;
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

    public Boolean getLogged() {
        return logged;
    }

    public void setLogged(Boolean logged) {
        this.logged = logged;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", logged=" + logged +
                '}';
    }
}
