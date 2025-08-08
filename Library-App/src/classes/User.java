package classes;

import java.util.ArrayList;
import java.util.List;

public class User {

    String userName;
    List<Book> books = new ArrayList<>();
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
