package first_mounth.week_1.day5;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter seconds for preparing: ");
        int s = scanner.nextInt();
        for (int i = s;i>=1;i--) {
            System.out.println(i);
        }
        System.out.println("Start");
    }
}