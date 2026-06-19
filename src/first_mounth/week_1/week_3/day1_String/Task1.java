package first_mounth.week_1.week_3.day1_String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = s.next();
        String end = nsrk(word);
        System.out.print(end);

    }
    public static String nsrk (String word) {
        return  (word.substring(1, word.length() -1) );
    }
}
