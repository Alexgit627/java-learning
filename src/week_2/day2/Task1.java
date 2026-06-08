package week_2.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner  (System.in);

        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter columns: ");
        int columns = scanner.nextInt();

        int [][] arr = new int [rows][columns];

        int r = 0;

        while (r < arr.length){

            int c = 0;

            while ( c < arr[r].length) {
                System.out.print("Enter arr[" + r + "][" + c + "]: ");
                arr[r][c] = scanner.nextInt();
                c++;
            }
            r++;

        }
        System.out.println("ur arr is");
        r = 0;
        while ( r < arr.length) {

            int c = 0;
            while (c < arr[r].length) {

                System.out.print(arr[r][c] + " ");
                c++;
            }

            System.out.println();
            r++;
        }



    }
}
