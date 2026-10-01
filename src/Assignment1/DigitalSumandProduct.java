package Assignment1;

import java.util.Scanner;

public class DigitalSumandProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);
        System.out.println("Divisible by 3: " + (sum % 3 == 0));
    }
}
