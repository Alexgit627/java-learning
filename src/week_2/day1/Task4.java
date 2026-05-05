package week_2.day1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of arr: ");

        int n = scanner.nextInt();
        int[] arr = new int[n];

        int even = 0;

        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter number: ");
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0 ) {
                even++;
            }
            i++;
        }
        i = 0;
        String evenn = " ";
        while (i < arr.length) {
            if (arr[i] % 2==0 ){
                evenn += arr[i] + " ";
            }
            i++;
        }
        System.out.println("Even numbers is: " + evenn);

        System.out.println("\ntotal number of even numbers " + even);



    }
}
