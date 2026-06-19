package first_mounth.week_1.week_2.day5_String;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k = scanner.nextInt();
        String result = name(k);
        System.out.println(result);

    }
    public static String name (int i ) {

        if ( i % 2 ==0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

}
