package Assignment1;

import java.util.Scanner;

public class ATMTransactionSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();

        while (true) {

            char operation = sc.next().charAt(0);

            if (operation == 'D') {

                int amount = sc.nextInt();
                balance += amount;

                System.out.println("Deposited: " + amount);

            } else if (operation == 'W') {

                int amount = sc.nextInt();

                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount);
                } else {
                    System.out.println("Insufficient Balance");
                }

            } else if (operation == 'B') {

                System.out.println("Balance: " + balance);

            } else if (operation == 'E') {

                break;
            }
        }

        System.out.println("Final Balance: " + balance);
    }
}