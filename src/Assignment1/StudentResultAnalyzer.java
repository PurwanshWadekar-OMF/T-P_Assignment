package Assignment1;

import java.util.Scanner;

public class StudentResultAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 0;
        int failedSubjects = 0;

        for (int i = 0; i < n; i++) {

            int marks = sc.nextInt();

            total += marks;

            if (marks < 40) {
                failedSubjects++;
            }
        }

        double average = (double) total / n;

        String result;

        if (failedSubjects == 0 && average >= 50) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Failed Subjects: " + failedSubjects);
        System.out.println("Result: " + result);
    }
}