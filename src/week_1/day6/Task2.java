package week_1.day6;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" guess the number : ");

        while(true) {
            int n = s.nextInt();

            if (n==0) {
                System.out.println("well done!");
                break;
            }
            System.out.println("one more");

        }

    }
}
