package first_mounth.week_1.week_2.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of rows:  ");
        int rows = scanner.nextInt();
        System.out.println("Enter quantity of columns: ");
        int columns = scanner.nextInt();

        int arr [][] = new int[rows][columns];

        int r = 0;
        while (r < arr.length) {

            int c = 0;
            while (c < arr[r].length) {
                System.out.print("Enter arr[" + r + "][" + c + "]: ");
                arr[r][c] = scanner.nextInt();
                c++;
            }
            r++;

        }
        System.out.println("Your sum of arr is: ");
        int sum = 0;
        r = 0;
        while( r < arr.length) {
            int c = 0;
            while (c < arr[r].length){
               sum += arr[r][c];
                c++;

            }
            r++;
        }
        System.out.print(sum);
    }
}
