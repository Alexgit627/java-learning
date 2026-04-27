package week_1.day3;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur login please");
        String login = scanner.next();
        if (login.equals("admin")) {
            System.out.println("Welcome");
        } else {
            System.out.println("U are not admin");
        }
    }
}
