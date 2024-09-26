package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    List<Book> books = new ArrayList<Book>();
    Scanner sc = new Scanner(System.in);

    public void addBook(Book book) {
        books.add(book);
    }

    public Book addTenBook() {
        String title = "eqfa";
        String author = "aef";
        int isbn = 0;
        String publisher = "eafef";
        boolean available = true;

        return new Book(title, author, publisher, isbn,available );
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
