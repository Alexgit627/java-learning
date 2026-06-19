package first_mounth.week_1.day5;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = s.nextInt();
        int count = 0;

        for (int i = 3; i <= n; i += 3) {
            count ++;
        }
        System.out.println(count);
    }
}
