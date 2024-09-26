package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harrypotter", "Emil", "emil", 20, false);
        String adminUser = "admin";
        String adminPas = "admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Username");
        String Username = sc.nextLine();
        System.out.println("Please enter password");
        String Password = sc.nextLine();


        if (Username.equals(adminUser) && Password.equals(adminPas)) {
            System.out.println("You are logged in");
            book = new Book("Harrypotter", "Emil", "emil", 20, false);


        }

        System.out.println();

    }
}