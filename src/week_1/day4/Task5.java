package week_1.day4;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your role: " );
        String role = scanner.next();

        if (role.equals("admin")) {
            System.out.print("Access granted");
        } else {
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Do you have a ticket?");
            String hasTicket = scanner.next();
            if (age >=18 && hasTicket.equals("yes") ) {
                System.out.println("Access granted");
            } else {
                System.out.print("Access denied ");
            }

        }
        scanner.close();
    }
}
