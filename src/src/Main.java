package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static BookService bookService = new BookService();
    static Book book;
    public static void main(String[] args) {


       bookService.addBook(new Book("Harry Potter och De Vises Sten", "J.K. Rowling", "Fantasy", 223, true));
        bookService.addBook(new Book("Harry Potter och Hemligheternas Kammare", "J.K. Rowling", "Fantasy", 251, false));  // En bok som inte är tillgänglig
        bookService.addBook(new Book("Harry Potter och Fången från Azkaban", "J.K. Rowling", "Fantasy", 317, true));
        bookService.addBook(new Book("Harry Potter och Den Flammande Bägaren", "J.K. Rowling", "Fantasy", 636, true));

        // Samma kod för admin-login etc.
        String adminUser = "admin";
        String adminPas = "admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Username");
        String Username = sc.nextLine();
        System.out.println("Please enter password");
        String Password = sc.nextLine();


        if (Username.equals(adminUser) && Password.equals(adminPas)) {
            System.out.println("You are logged in");
            System.out.println("1.See Available Books \n 2. Information about a book \n 3. List for unavailable books \n 4.Turn in an borrowed book");
            int anst = sc.nextInt();
            switch (anst) {
                case 1 -> avaliableBooks();
                case 2 ->

            }
        }
    }

    static void avaliableBooks() {
       bookService.printBooks();
    }
    static void printInformation() {

    }
}