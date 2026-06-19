package first_mounth.week_1.week_2.day5_String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ypur name: ");
        String name = scanner.next();
        System.out.println("Length is: " + name.length());
        System.out.println("Your first letter: " + name.charAt(0));


    }
}
