package week_2.day1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        int i = 0;

        while (i < arr.length) {
            System.out.print("Enter number: ");
            arr[i] = scanner.nextInt();
            sum+=arr[i];
            i++;
        }
        System.out.println(sum);
    }
}
