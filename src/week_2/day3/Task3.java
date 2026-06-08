package week_2.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter length of array: ");
        int r = scanner.nextInt();
        int arr [] = new int[r];

        int sum1 = Superarr(arr);
        System.out.println("Sum1 = " + sum1);
    }

    public static int Superarr (int [] array) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for ( int i = 0; i < array.length;i ++) {
            System.out.println("Enter number of arr: ");
            array [i] = scanner.nextInt();
            sum += array[i];
        }
        return sum;


    }

}
