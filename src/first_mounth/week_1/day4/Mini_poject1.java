package first_mounth.week_1.day4;

import java.util.Scanner;

public class Mini_poject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to our shop! Please,enter your name: ");
        String name = scanner.next();
        System.out.printf("Hello %s!\nHow old are you? ",name);

        int ticketPrice = 0;

        int age = scanner.nextInt();
        if (age < 18) {
            System.out.print("Access denied: age ");
        } else {
            System.out.println("Are you a student? ");
            String role = scanner.next();
            if (role.equals("yes")) {
                System.out.println("Please choose type of ticket\nStandard-1\nvip-2\nStudent-3");
                int ticketType = scanner.nextInt();
                switch (ticketType) {
                    case 1:
                        ticketPrice = 500;
                        System.out.print("You have chosen Standard ticket!\nYou should to pay 500$\n");
                        break;
                    case 2:
                        ticketPrice = 900;
                        System.out.print("You have chosen VIP ticket!\nYou should to pay 900$\n");
                        break;
                    case 3:
                        ticketPrice = 300;
                        System.out.print("You have chosen Student ticket!\nYou should to pay 300$\n");
                        break;
                    default:
                        System.out.print("Invalid ticket type\n");
                }
                System.out.print("Enter your balance:");
                double balance = scanner.nextDouble();
                System.out.print("Please, Enter promo: ");
                String promo = scanner.next();
                double discount = ((ticketPrice * 10.0) / 100);
                double fullprice = balance - (ticketPrice- discount);

                if (promo.equals("HALVA123") && balance >= fullprice) {
                    System.out.printf("Promo applied\nYour change is = %.2f\nSee you later %s",fullprice,name);
                } else if (balance >= ticketPrice) {
                    System.out.printf("Promo denied\nYour change is = %.2f\nSee you later %s  ",(balance - ticketPrice),name);
                } else {
                    System.out.println("not enough money");
                }


            } else {
                System.out.println("Please choose type of ticket\nStandard-1\nvip-2");
                int ticketType = scanner.nextInt();
                switch (ticketType) {
                    case 1:
                        ticketPrice = 500;
                        System.out.print("You have chosen Standard ticket!\nYou should to pay 500$\n");
                        break;
                    case 2:
                        ticketPrice = 900;
                        System.out.print("You have chosen VIP ticket!\nYou should to pay 900$\n");
                        break;
                    default:
                        System.out.print("Invalid ticket type");

                }

                System.out.print("Enter your balance: ");
                double balance = scanner.nextDouble();
                System.out.print("Please, Enter promo: ");
                String promo = scanner.next();
                double discount = ((ticketPrice * 10.0) / 100);
                double fullprice = balance - (ticketPrice - discount);

                if (promo.equals("HALVA123") && balance > fullprice) {
                    System.out.printf("Promo applied\nYour change is = %.2f\nSee you later! ",fullprice,name);
                } else if (balance >= ticketPrice) {
                    System.out.printf("Promo denied\nYour change is = %.2f\nSee you later %s  ",(balance - ticketPrice),name);
                } else {
                    System.out.println("not enough money");
                }


            }     }   }    }