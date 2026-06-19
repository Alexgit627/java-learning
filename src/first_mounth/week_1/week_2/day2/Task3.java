package first_mounth.week_1.week_2.day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);

        System.out.println("Enter quantity of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter quantity of columns: ");
        int columns = scanner.nextInt();

        int arr [][] = new int[rows][columns];
        int r = 0;
        while (r < arr.length) {
            int c = 0;
            while(c < arr[r].length) {
                System.out.print("Enter number in arr [" + r + "][" + c + "]: ");
                arr[r][c] = scanner.nextInt();
                c++;
            }
            r++;
        }

        int max = arr[0][0];
        r = 0;
        while (r < arr.length) {
            int c = 0;
            while ( c < arr[r].length) {
                if ( arr[r][c] > max ) {
                    max = arr[r][c];
                }
                c++;
            }
            r++;
        }
        System.out.println("The max number is: " + max);
    }
}
