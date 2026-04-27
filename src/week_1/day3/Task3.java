package week_1.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.printf("Max %d" ,a);
        } else if (a < b) {
            System.out.printf("Max %d",b );
        } else {
            System.out.println("Numbers are equal");
        }
        scanner.close();
    }
}
