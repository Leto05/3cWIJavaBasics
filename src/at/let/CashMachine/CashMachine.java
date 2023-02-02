package at.let.CashMachine;

import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {
        int Balance= 0;

        Scanner scanner = new Scanner(System.in);
        int userSelection =0;
        do {

            System.out.println("Was moechten Sie tun?");
            System.out.println("1 Geld einzahlen");
            System.out.println("2 Geld abheben");
            System.out.println("3 Kontostand einsehen");
            System.out.println("4 Vorgang beenden");

            userSelection = scanner.nextInt();

            if (userSelection == 1) {
                System.out.println("Wie viel moechten Sie einzahlen?");
                int moneyAmount = scanner.nextInt();
                Balance = Balance + moneyAmount;
                System.out.println("Sie haben " + moneyAmount + " Euro eingezahlt");
            }
            if (userSelection == 2) {
                System.out.println("Wie viel moechten Sie abheben?");
                int moneyAmount = scanner.nextInt();
                Balance = Balance - moneyAmount;
                System.out.println("Sie haben " + moneyAmount + " Euro ausgezahlt");
            }
            if (userSelection == 3) {
                System.out.println("Ihr Kontostand beträgt:");
                System.out.println(Balance);
            }
        }while (userSelection != 4);
    }
}