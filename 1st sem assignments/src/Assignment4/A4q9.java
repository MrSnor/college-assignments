package Assignment4;

/* Question :-
Write a java program to print largest power of two less than or equal to N. Where, N is the input to the program. */

/* Output :
Enter the value of n :2000
Answer = 1024.0 */

import java.util.Scanner;

public class A4q9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int num = in.nextInt();
        double powered = 1 , power = 0;
        while (powered <= num) {
            powered = Math.pow(2, power);
            power++;
        }
        // showing the largest power of 2 lesser or equal to given number 
        // (dividing by 2 to show the number just before breaking out of while loop)
        System.out.println("Answer = " + powered/2 );
    }
}
