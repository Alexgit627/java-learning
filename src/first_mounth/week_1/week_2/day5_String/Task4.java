package first_mounth.week_1.week_2.day5_String;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
