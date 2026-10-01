package Assignment1;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Even or Odd
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Positive or Zero
        if (n > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }

        // Divisible by 5 or Not
        if (n % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not Divisible by 5");
        }
    }
}
