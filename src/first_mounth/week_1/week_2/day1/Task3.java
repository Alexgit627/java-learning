package first_mounth.week_1.week_2.day1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of arr: ");
        int  n = scanner.nextInt();
        int [] arr = new int[n];

        int i = 0;

        while (i < arr.length) {
            System.out.print("Enter number: ");
            arr[i] = scanner.nextInt();
            i++;
        }

        int min = arr[0];
        i = 1;

        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }

        System.out.println(min);
    }
}
