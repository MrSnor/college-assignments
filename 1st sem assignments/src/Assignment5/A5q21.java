package Assignment5;

import java.util.Scanner;

// Write a java program GCD that finds the greatest common divisor (gcd) of two integers using "Euclid’s algorithm", which is an iterative computation based on the following observation: if x is greater than y, then if y divides x, the gcd of x and y is y; otherwise, the gcd of x and y is the same as the gcd of x % y and y.

public class A5q21 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the First Number :");
        int num1 = in.nextInt();
        System.out.print("Enter the Second Number :");
        int num2 = in.nextInt();

       
        normalGCD(num1, num2);

        eucledeanGCD(num1, num2);
        // System.out.println("GCD of "+num1+" and "+num2+" is "+factor);
    }
    
    public static void normalGCD(int num1, int num2) {
         // testFactor -> checking if that number is factor of given numbers(num1,num2)
        int factor = 1, testFactor = 1;
        while (testFactor <= Math.min(num1, num2)) {
            if (num1 % testFactor == 0 && num2 % testFactor == 0) {
                // assign factor as the passed testFactor
                factor = testFactor;
            }
            testFactor++;
        }
        System.out.println(factor);
    }

    public static void eucledeanGCD(int num1, int num2) {

        int a = Math.max(num1, num2), b = Math.min(num1, num2);
        var rem = 0;

        // eucledean GCD algorithm is being used, check it from somewhere or the question in the 1st comment
        while (b > 0) {
            rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println(a);
    }
}
