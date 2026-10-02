package Assignment1;

import java.util.Scanner;

public class BankLoanEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double existingEMI = sc.nextDouble();
        int creditScore = sc.nextInt();
        double loanAmount = sc.nextDouble();
        double annualInterest = sc.nextDouble();
        int months = sc.nextInt();

        boolean eligible =
                salary >= 25000 &&
                        creditScore >= 700 &&
                        existingEMI <= salary * 0.40;

        String loanStatus;

        if (eligible) {
            loanStatus = "ELIGIBLE";
        } else {
            loanStatus = "NOT ELIGIBLE";
        }

        System.out.println("Loan Status: " + loanStatus);

        if (eligible) {

            double maximumEMI = (salary * 0.50) - existingEMI;

            double monthlyRate = annualInterest / 12 / 100;

            double power = Math.pow(1 + monthlyRate, months);

            double estimatedEMI =
                    (loanAmount * monthlyRate * power)
                            / (power - 1);

            System.out.printf("Maximum EMI: %.2f%n", maximumEMI);
            System.out.printf("Estimated Monthly EMI: %.2f%n", estimatedEMI);
        }

        sc.close();
    }
}