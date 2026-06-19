package first_mounth.week_1.day3;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur score: 61");

        int score = scanner.nextInt();
        if (score < 0 ) {
            System.out.println("Invalid score");
        }
        else if (score >100) {
            System.out.println("Invalid score");
        }
        else if (score >= 90 ) {
            System.out.println("Excellent");
        } else if (score >=75 ) {
            System.out.println("Goood");
        } else if (score >= 60) {
            System.out.println("Normal");
        } else if ( score <= 59) {
            System.out.println("Bad");
        }
    }
}
