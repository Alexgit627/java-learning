package first_mounth.week_1.day6;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        while (n <= 10 ) {
            if (n == 5) {
                n++;
                continue;

            }
            System.out.println(n);
            n++;

        }
    }
}
