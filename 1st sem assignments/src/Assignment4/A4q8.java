package Assignment4;

/* Question :-
An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your program to determine
whether or not the number is divisible by 9.
*/

/* Output :-
Enter a number :123456
Digits of the number are :
6
5
4
3
2
1
123456 is not divisible by 9 */

import java.util.Scanner;

public class A4q8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=in.nextInt();
        System.out.println("Digits of the number are :");
        int a = num, sum = 0;
        while (a > 0) {
            int digit = a % 10;
            System.out.println(digit);
            a = a / 10;
            sum += digit;
        }
        if (sum % 9 == 0)
            System.out.print(num + " is divisible by 9");
        else
            System.out.print(num + " is not divisible by 9");
    }
}
