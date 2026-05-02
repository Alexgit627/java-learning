package week_1.day6;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int count = 0;
         int sum = 0;
         int average = 0;

        while(true) {
            System.out.println("Enter number: ");
            int n = scanner.nextInt();


            if (n == 0) {
                break;
            }

            sum+=n;
            count++;
            average = sum / count;
        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(average);

    }
}
