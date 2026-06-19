package first_mounth.week_1.week_2.day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter size of arr: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int i = 0;
        while ( i < arr.length) {
            System.out.print("Enter number: ");
            arr[i] = scanner.nextInt();
            i++;
        }
        i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;

        }
    }
}
