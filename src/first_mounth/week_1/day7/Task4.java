package first_mounth.week_1.day7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for ( int i = 0; i < arr.length;i++){
            System.out.print("Enter number: ");
            arr[i] = scanner.nextInt();

        }
        int count = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("Positive: " + count);

        int neg = 0;
        for(int i = 0; i < arr.length;i++) {
            if (arr[i] < 0) {
                neg++;
            }
        }
        System.out.println("Negative: " + neg);

        int zero = 0;
        for( int i = 0;  i < arr.length;i++) {
            if (arr[i]==0) {
                zero++;
            }
        }
        System.out.println("Zero: " + zero);

    }
}
