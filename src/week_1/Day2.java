package week_1;
import java.util.Locale;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter seconds");
        int seconds = scanner.nextInt();
        System.out.printf("Hours: %d, minutes: %d, seconds: %d.",(seconds /3600),(seconds %3600/60),(seconds %60));
    }
}

