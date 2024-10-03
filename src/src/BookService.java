package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static src.Main.book;

public class BookService {
    List<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book addTenBook() {
        String title = "";
        String author = "";
        int isbn = 0;
        String publisher = "";
        boolean available = true;
        String information = "";

        return new Book(title, author, publisher, isbn, available, information);
    }

    public void printBooks() {

        for (Book book : books) {
            if (book.isBorrowed()) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getInformation());
            } else System.out.println("This  books is not Avalible " + book.getTitle());
        }
    }

    public void printInformation() {
        for (Book book : books) {
            System.out.println(book.getInformation());
        }
    }

    public void returnBook() {

        System.out.println("What book do you want to return?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (Book book : books) {
            if (input == book.getIsbn()) {
                book.setBorrowed(true);
            }
        }
        System.out.println("Thank you for returning the book.");
        printBooks();


    }
}
