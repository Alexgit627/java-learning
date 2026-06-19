package first_mounth.week_1.week_2.day6_String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String result = checkLogin();
        System.out.println(result);

    }
    public static String checkLogin () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your login: ");
        String login = scanner.next();

        if(login.equals("Alex")) {
            return ("Hello,Alex");
        } else {
            return ("Unknown user ");
        }

    }
}
