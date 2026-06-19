package first_mounth.week_1.week_2.day4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of array: ");
        int s = scanner.nextInt();
        int array [] = new int[s];

        int minimum = minimumArr(array);
        System.out.println("Your minimum element is: " + minimum);

    }
    public static int minimumArr (int arr[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first element: ");
        arr[0] = scanner.nextInt();
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an array element: ");
            arr[i] = scanner.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
