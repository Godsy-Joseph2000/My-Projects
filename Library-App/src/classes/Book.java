package classes;

public class Book {

    String name;
    boolean borrowed;
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

}
