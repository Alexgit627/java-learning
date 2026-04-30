package week_1.day4;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of day");
        int day = scanner.nextInt();
        if (day > 7 || day < 1 ) {
            System.out.println("Unknown day");
        } else if (day == 7 || day == 6) {
            System.out.println("Weekend");
        } else {
            System.out.println("Workday");
        }
        scanner.close();

    }
}
