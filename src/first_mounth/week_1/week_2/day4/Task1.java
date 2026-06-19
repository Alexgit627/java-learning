package first_mounth.week_1.week_2.day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of array: ");
        int r = scanner.nextInt();
        int arr [] = new int[r];

        int maximum = arrayEnter(arr);

        System.out.println("The max number in array is:" + maximum);

    }

    public static int arrayEnter (int [] ar) {
        Scanner scanner = new Scanner(System.in);
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter number in array: ");
            ar[i] = scanner.nextInt();
            if (ar[i] > max) {
                max = ar[i];
            }
        }

        return max;
    }
}
