package week_1.day7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for ( int i = 0; i < arr.length; i++){
            System.out.print("Enter number: ");
             arr[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max number is: " + max);


        int min = arr[0];
        for ( int i = 0; i < arr.length;i++) {
            if (arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.println("Min number is: " + min);


    }
}
