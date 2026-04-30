package week_1.day4;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of day 1-7: ");

        int day = scanner.nextInt();
        switch (day) {
            case 6:
            case 7:
                System.out.println("Weekend");
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Workday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
