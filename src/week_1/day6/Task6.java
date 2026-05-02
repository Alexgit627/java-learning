package week_1.day6;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int password = 0;
        do {
            System.out.println("Enter password: ");
            int n = scanner.nextInt();
            password = n;
        } while (password != 12345 );
        System.out.println("Access granted");
    }
}
