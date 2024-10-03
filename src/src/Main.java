package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book Harpot = new Book("Harry Potter och De Vises Sten", "J.K. Rowling", "Fantasy", 223, true);
        Book Harpot2 = new Book("Harry Potter och Hemligheternas Kammare", "J.K. Rowling", "Fantasy", 251, true);
        Book Harpot3 = new Book("Harry Potter och Fången från Azkaban", "J.K. Rowling", "Fantasy", 317, true);
        Book Harpot4 = new Book("Harry Potter och Den Flammande Bägaren", "J.K. Rowling", "Fantasy", 636, true);
        Book Harpot5 = new Book("Harry Potter och Fenixorden", "J.K. Rowling", "Fantasy", 766, true);
        Book Harpot6 = new Book("Harry Potter och Halvblodsprinsen", "J.K. Rowling", "Fantasy", 607, true);
        Book Harpot7 = new Book("Harry Potter och Dödsrelikerna", "J.K. Rowling", "Fantasy", 608, true);
        Book Harpot8 = new Book("Harry Potter och Dödsrelikerna", "J.K. Rowling", "test1", 609, true);
        Book Harpot9 = new Book("Harry Potter och Dödsrelikerna", "J.K. Rowling", "test2", 610, true);
        Book Harpot10 = new Book("Harry Potter och Dödsrelikerna", "J.K. Rowling", "test3", 611, true);


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

            }
        }
    }

    static void avaliableBooks() {
        for (int i = 0; i < ; i++) {

        }
    }
}