package w3_OopLearning.day1realtasks;

import java.util.Scanner;

public class PasswordTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String passw = scanner.nextLine();

        Password pas1 = new Password(passw);
        Boolean gg = pas1.isStrong();
        System.out.println(gg);




    }
}
