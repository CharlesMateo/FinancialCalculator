package com.pluralsight;
import java.util.Scanner;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        // Objective: Understand the process of converting an annual interest rate to a monthly rate.
        // Exercise: Write a program that asks for an annual interest rate and then calculates and displays the monthly interest rate.
        // A loan 10% interest yearly
        // How much is that monthly

        // Declaring the Variables
        /*double yearlyInterest = 0

        // Ask for input
        System.out.println("What is the annual interest rate?");
        yearlyInterest = reader.nextDouble();

        // Calculations (algorithm) -> step by step to the solution
        double monthlyInterest = (yearlyInterest / 12);*/

        // Output
        //int principalLoan = 0

        System.out.print("Enter the principal amount: ");
        double principalLoan = reader.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double interestRate = reader.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = reader.nextInt();

        System.out.print("Enter the time in years: ");
        int t = reader.nextInt();

        // Calculate compound interest
        double amount = principalLoan * Math.pow(1 + (interestRate / 100) / n, n * t);
        double interest = amount - principalLoan;

        System.out.printf("Compound interest: %.2f\n", interest);
        System.out.printf("Total amount: %.2f\n", amount);


        // System.out.printf("Monthly interest %.2f", monthlyInterest)

        reader.close();
    }
}