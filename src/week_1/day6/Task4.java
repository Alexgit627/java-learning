package week_1.day6;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {

            System.out.println("Enter number: ");
            int n = scanner.nextInt();

            if (n == 0 ) {

                System.out.println(count);
                break;
            } else {
                count++;
            }

        }
        System.out.println(count);

    }

}
