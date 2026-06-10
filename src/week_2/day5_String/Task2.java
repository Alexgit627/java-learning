package week_2.day5_String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Your first element is: " + name.charAt(0));
        System.out.println("Your last element is: " + name.charAt(name.length() - 1));
    }
}
