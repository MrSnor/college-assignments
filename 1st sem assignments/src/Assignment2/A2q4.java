package Assignment2;

import java.util.Scanner;

public class A2q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000:");

        int sum = 0;
        int num = in.nextInt();

        sum += num % 10;
        num = num / 10;

        sum += num % 10;
        num = num / 10;

        sum += num % 10;
        num = num / 10;

        System.out.println("The sum of the digits is " + sum);
    }
}
