package week_1.day5;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
