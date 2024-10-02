package com.pluralsight;
import java.util.Scanner;

public class MorgageCalculator {

    static int monthInYears = 12;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double principle;
        float annualInterestRate; // inside the math it is e.g 6 / 100
        float numberOfPayments;
        int loanTerm;

        System.out.println("Enter Home Price: ");
        principle = myScanner.nextDouble();

        System.out.println("Enter your interest rate: ");
        annualInterestRate = myScanner.nextFloat();

        System.out.println("Enter loan term: ");
        loanTerm = myScanner.nextInt();

        float monthlyInterest = annualInterestRate / monthInYears;

        int numberOfPayment = loanTerm * monthInYears;

        double monthlyPayments = principle * (Math.pow(1 + (annualInterestRate / 100), loanTerm));
        System.out.printf("$%.2f", monthlyPayments);
    }
}
