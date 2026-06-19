package first_mounth.week_1.day5;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();



        for (int i = b; i >= a ;i--) {
            System.out.println(i);
        }
    }
}
