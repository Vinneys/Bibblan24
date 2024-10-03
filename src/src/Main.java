package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean stop = false;
    static BookService bookService = new BookService();
    static Book book;
    public static void main(String[] args) {


        bookService.addBook(new Book("Harry Potter och De Vises Sten", "J.K. Rowling", "Fantasy", 223, true, " info"));
        bookService.addBook(new Book("Harry Potter och Hemligheternas Kammare", "J.K. Rowling", "Fantasy", 251, false, " info"));  // En bok som inte är tillgänglig
        bookService.addBook(new Book("Harry Potter och Fången från Azkaban", "J.K. Rowling", "Fantasy", 317, true, " info"));
        bookService.addBook(new Book("Harry Potter och Den Flammande Bägaren", "J.K. Rowling", "Fantasy", 636, true, " info"));

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
            while (!stop) {

                System.out.println(" 1.See Available Books \n 2. Information about a book \n 3.Turn an borrowed book \n 4. Press for exit ");
                int anst = sc.nextInt();

                    switch (anst) {
                        case 1 -> bookService.printBooks();
                        case 2 -> bookService.printInformation();
                        case 3 -> bookService.returnBook();
                        case 4 -> stop = true;

                    }
            }
        }
    }
}