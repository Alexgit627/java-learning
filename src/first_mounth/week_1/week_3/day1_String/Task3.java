package first_mounth.week_1.week_3.day1_String;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name and surname: ");
        String ns = scanner.nextLine();
        String it = check(ns);
        System.out.print(it);

    }
    public static String check (String str) {
        int space = str.indexOf(" ");

        return (str.charAt(0) + "." + str.charAt(space + 1));
    }
}
