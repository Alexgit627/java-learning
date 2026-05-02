package week_1.day6;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.println("Enter number: ");
            int n = scanner.nextInt();

            if (n == 0){
                break;
            }

            sum+=n;
        }
        System.out.println(sum);
    }
}
