package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        return new Book(title, author, publisher, isbn,available );
    }

    public void printBooks() {

        for (Book book : books) {
            if (book.isBorrowed()) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getPublisher());
            }else
            System.out.println("This  books is not Avalible " + book.getTitle());
        }
    }
}
