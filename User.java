// User.java
public class User {
    private String name;
    private int id;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "User: " + name + " (ID: " + id + ")";
    }
}
