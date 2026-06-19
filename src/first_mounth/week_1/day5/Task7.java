package first_mounth.week_1.day5;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 2; i <= n;i+=2) {
          sum+=i;
        }
        System.out.println(sum);
    }
}
