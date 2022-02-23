package classWork;

import java.util.Scanner;

// extension of this question at question 10 of classwork
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int valToBeChecked = sc.nextInt();
        if (isPrime(valToBeChecked))
            System.out.println(valToBeChecked + " is Prime");
        else
            System.out.println(valToBeChecked + " is Not prime");
    }

    public static Boolean isPrime(int arg) {
        for (int i = 2; i <= Math.sqrt(arg); i++) {
            if (arg % i == 0)
                return false;
        }
        return true;
    }

}
