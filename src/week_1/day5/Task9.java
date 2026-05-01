package week_1.day5;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");


        int n = scanner.nextInt();
        for (int i  = 1;i <= 10;i++){
            System.out.printf("%d x %d = %d\n",n,i,(n*i));
        }
    }
}
