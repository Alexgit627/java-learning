package week_1.day3;

import java.util.Scanner;
import java.util.Locale;
public class Mini_project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Access dined: age");
        } else {
            System.out.println("Enter login");
            String login = scanner.next();
            if (login.equals("admin")) {
                System.out.println("Enter password");
                int password = scanner.nextInt();
                if (password == 12345){
                    System.out.println("Access granted");
                } else {
                    System.out.println("Access denied: password");
                }
            } else {
                System.out.println("Access denied: login");
            }
        }

    }
}