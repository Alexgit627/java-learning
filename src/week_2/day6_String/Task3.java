package week_2.day6_String;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = s.nextDouble();
        double c = num(a);
        System.out.print(c);


    }
    public static double num( double a) {
        if(a >=0 ) {
            return ( -1 * a);
        }
        else {
            return (a);
        }
    }
}
