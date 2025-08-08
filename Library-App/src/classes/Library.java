package classes;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    //add book to List Book
    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

}
