package Assignment1;

import java.util.Scanner;

public class ParkingFeeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of vehical");
        int operation = sc.nextInt();
        int collection = 0;
        while(operation-- > 0){
            char ch = sc.next().charAt(0);
            int hr = sc.nextInt();
            if(ch =='C'){
                if (hr <= 2) {
                    collection += hr * 30;
                } else {
                    collection += 2 * 30 + (hr - 2) * 20;
                }
            }
            else if (ch=='B'){
                if (hr <= 2) {
                    collection += hr * 15;
                } else {
                    collection += 2 * 15 + (hr - 2) * 10;
                }
            }else{
                if (hr <= 2) {
                    collection += hr * 50;
                } else {
                    collection += 2 * 50 + (hr - 2) * 40;
                }
            }
        }
        System.out.println("Total Collection :"+ collection );
    }
}
