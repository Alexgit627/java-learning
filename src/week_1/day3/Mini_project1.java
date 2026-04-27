package week_1.day3;
import java.util.Scanner;
import java.util.Locale;
public class Mini_project1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ur name: ");
        String name = scanner.next();
        System.out.printf("Hello %s, welcome to our shop! How old are u?%n ",name);
        int age = scanner.nextInt();
        if (age >= 18 ) {
            System.out.println("Adult");
            System.out.println("Enter ur balance please: ");
            double balance = scanner.nextDouble();
            System.out.printf("Thanks,u have %.2f%n", balance);
            System.out.println("Enter total price and count,please: ");
            double price = scanner.nextDouble();
            int count = scanner.nextInt();
            double totalPrice = price * count;
            System.out.printf("Total price is %.2f%n", totalPrice);

            if (totalPrice > balance) {
                System.out.println("Insufficient funds");
            } else {
                System.out.println("Thank you for  buying, come again");
            }
        } else {
            System.out.println("I’m sorry, I can’t sell this to you. You must be 18 or older.");
        }

    }
}
