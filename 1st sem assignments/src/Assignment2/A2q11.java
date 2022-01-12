package Assignment2;

import java.util.Scanner;

public class A2q11 {
    public static void main(String args[]) {
        double investmentAmount, annualInterest, accumulatedValue, monthlyInterestRate;
        int numberOfYears;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter investment  amount :");
        investmentAmount = in.nextDouble();

        System.out.print("Enter annual interest rate in percentage :");
        annualInterest = in.nextDouble();

        System.out.print("Enter number of years :");
        numberOfYears = in.nextInt();

        monthlyInterestRate = annualInterest / 1200.0;
        accumulatedValue = investmentAmount * Math.pow((monthlyInterestRate + 1), numberOfYears * 12);

        System.out.println("Accumulated value is $" + accumulatedValue);
    }
}
