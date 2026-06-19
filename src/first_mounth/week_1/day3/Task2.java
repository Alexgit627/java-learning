package first_mounth.week_1.day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.print("Ur number is Negative ");
        } else if (number > 0) {
            System.out.print("Ur number is Positive");
        } else {
            System.out.print("Zero");
        }
        scanner.close();
    }
}
