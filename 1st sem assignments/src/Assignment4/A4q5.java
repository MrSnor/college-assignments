package Assignment4;

// Question :-
// Write a java program to print the sum of all even numbers and the 
// product of all odd numbers from 1 to N. Where, N is the input to the program.
// For input, N = 10
// Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
// Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945

public class A4q5 {
    public static void main(String[] args) {
        int sum = 0, product = 1, N = Integer.parseInt(args[0]);
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                product *= i;
            }
        }

        System.out.println("sum of evens = " + sum);
        System.out.println("product of odds = " + product);
    }
}
