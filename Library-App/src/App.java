import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Book;
import classes.Library;
import classes.User;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Library library = new Library();
    static List <Book> books = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Console cnsl = System.console();

        System.out.println("Welcome to the Library");
        while (true) {
            System.out.println("1 : Add Book");
            System.out.println("2 : Add user");
            System.out.println("3 : Borrow Book");
            System.out.println("4 : Return Book");
            
            System.out.println("Enter you Option");
            String choice = sc.nextLine();
            int option = Integer.parseInt(choice);

            switch (option) {
                case 1 :
                    addNewBook();
                    break;
                case 2 : 
                    addNewUser();
                    break;
                case 3 : 
                    borrowBook();
                    break;
                case 4 :
                    returnBook();
                    break;
                default :
                    System.out.println("invalid option");
                    break;
            }
            for (Book book : library.getBooks()) {
                System.out.println(book.getName());
                
            }
            System.out.println("\n\n=========================================================================\n\n");
        }

    }

    private static void returnBook() {
        System.out.println("Enter Book name want to return");
        String bookname = sc.nextLine();
        System.out.println("recieved " + bookname +" successfully");
       
    }

    private static void borrowBook() {
        System.out.println("Enter Book name to borrow:");
        String bookName = sc.nextLine();

        Book foundBook = null;
        for (Book book : library.getBooks()) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                foundBook = book;
                break;
            }
        }

        if (foundBook == null) {
            System.out.println("Book not found.");
            return;
        }

        if (foundBook.isBorrowed()) {
            System.out.println("Book is already borrowed.");
            return;
        } else {
            System.out.println("enter user name to borrow book");
            String userName = sc.nextLine();
            User foundUser = null;
            for(User user:library.getUsers()){
                if (user.getUserName().equalsIgnoreCase(userName)) {
                    foundUser = user;
                }
            if (foundUser == null) {
                System.out.println("user not found , please add user first");
                return;
            }
            foundBook.setBorrowed(true);
            foundBook.setUser(foundUser);
            foundUser.getBooks().add(foundBook);
            System.out.println("book borrowed successfully by the user " + foundUser.getUserName());
            }
            
        }
    }

    private static void addNewUser() {
        User user = new User();
        System.out.println("Enter User Name");
        String userName = sc.nextLine();
        user.setUserName(userName);
        library.addUser(user);
    }

    private static void addNewBook() {
        Book book = new Book();
        System.out.println("Enter Book name ");
        String bookName = sc.nextLine();
        book.setName(bookName);
        library.addBook(book);
    }
}
