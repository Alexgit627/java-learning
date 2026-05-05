package week_2.day1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0;i < arr.length; i++) {
            System.out.print("Enter number: ");
            arr[i]= scanner.nextInt();
        }
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else if (arr[i]==max){
                count++;
            }
        }
        System.out.print("The max number is:  " + max + '\n');
        System.out.print("The count of max is: " + count);






    }
}
