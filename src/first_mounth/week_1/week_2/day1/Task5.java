package first_mounth.week_1.week_2.day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter number: ");
            arr[i] = scanner.nextInt();
            i++;
        }
        i=0;
        int max = arr[0];
        int count = 1;

        while(i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                count=1;
            } else if (max == arr[i]) {
                count++;
            }
            i++;
        }
        System.out.println(max);
        System.out.println(count);
    }
}
