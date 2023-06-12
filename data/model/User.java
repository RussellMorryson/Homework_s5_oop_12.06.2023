package data.model;

public abstract class User {
    public String name;
    public int bornDate;

    public User (String name, int bornDate) {
        this.name = name;
        this.bornDate = bornDate;
    }
}
