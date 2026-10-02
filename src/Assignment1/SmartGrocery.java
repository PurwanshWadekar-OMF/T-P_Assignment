package Assignment1;

import java.util.Scanner;

public class SmartGrocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Items :");
        int items = sc.nextInt();
        float subTotal = 0;
        float discount = 0;
        while(items-- > 0){
            float price = sc.nextInt();
            int unit = sc.nextInt();
            subTotal += price * unit;
        }
            if (subTotal>10000){
                discount += (subTotal/100)*15;
            } else if (subTotal>5000) {
                discount += (subTotal/100)*10;
            }else if (subTotal>1000){
                discount += (subTotal/100)*5;
            }

        float tax = ((subTotal-discount)/100)*5;
        float finalAmount =  subTotal-discount+tax;
        System.out.printf("SubTotal : %.2f%n", subTotal);
        System.out.printf("Discount : %.2f%n", discount);
        System.out.printf("Tax : %.2f%n", tax);
        System.out.printf("FinalAmount : %.2f%n", finalAmount);
    }
}
