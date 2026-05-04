package week_1.day7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter numbers: ");
            arr [i] = scanner.nextInt();
        }

        System.out.print("All: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
             }
        System.out.print("\nOnly even: ");

        for ( int i = 0 ;i < arr.length;i++ ) {
            if (arr[i] %2 == 0) {
            System.out.print(arr[i] + " ");}
        }
        int sum = 0;



        for ( int i = 0; i < arr.length;i++) {
            sum += arr[i];
        }
        System.out.print("\nsum: " + sum);
        }
    }

