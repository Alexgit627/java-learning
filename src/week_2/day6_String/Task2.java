package week_2.day6_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scanner.next();
        String result = emailChecker(email);
        System.out.print(result);

    }
    public static String emailChecker (String text) {
        if(text.contains("@")) {
            return ("Contains @");
        }
        else {
            return ("Does not contain @");
        }


    }
}
