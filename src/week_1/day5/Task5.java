package week_1.day5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int N = scanner.nextInt();

        for ( int i = 2;i <=N;i+=2) {
            System.out.println(i);
        }
    }
}
