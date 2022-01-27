package classWork;

import java.util.Scanner;

public class q5 {
    static String isPrime(int arg) {

        for (int i = 2; i <= Math.sqrt(arg); i++) {
            if (arg % i == 0)
                return "not a prime coz of " + i + ", which gives " + arg + "/" + i + " = " + arg / i;
        }

        return "a prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int valToBeChecked = sc.nextInt();
        // int valToBeChecked = Integer.parseInt(args[0]);
        System.out.println(valToBeChecked + " is " + isPrime(valToBeChecked));
    }
}
