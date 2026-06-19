package first_mounth.week_1.day7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер массива введи: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length;i++) {
            System.out.println("Введи значениe: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
