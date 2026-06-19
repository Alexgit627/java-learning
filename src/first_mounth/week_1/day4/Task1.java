package first_mounth.week_1.day4;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = s1.nextInt();

        if (number % 2 == 0 ) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
