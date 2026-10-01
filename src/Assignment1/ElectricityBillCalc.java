package Assignment1;

import java.util.Scanner;

public class ElectricityBillCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int n = sc.nextInt();
        int ans = 0;
        if(n>400){
            ans = 100 *5 + 100 * 7 + 200 * 10 + (n-400) * 15;
        } else if (n>200){
            ans = 100 *5 + 100 * 7 + (n-200) * 10;
        } else if (n>100){
            ans = 100 *5 + (n-100) * 7;
        } else {
            ans = n * 5;
        }
        System.out.println("The total electricity bill is: " + ans);
    }
}
