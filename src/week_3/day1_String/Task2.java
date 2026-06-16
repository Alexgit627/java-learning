package week_3.day1_String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your LP: ");
        String sss = s.next();
        boolean gg = rim(sss);
        System.out.println(gg);

    }
    public static boolean rim(String str) {
        return (str.startsWith("J"));

    }
}
