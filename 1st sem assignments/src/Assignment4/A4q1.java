package Assignment4;
// Question :-

// Write a java program that gets three integers from the user. Count from the first number to 
// the second number in increments of the third number. Use a for loop to do it. 
// Count from: 4 
// Count to: 13 
// Count by: 3 
//  4 7 10 13

import java.util.Scanner;

public class A4q1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Count from: ");
		int b = in.nextInt();
		System.out.print("Count to: ");
		int c = in.nextInt();
		System.out.print("Count by: ");
		int d = in.nextInt();

		for (int a = b; a <= c; a = a + d)
			System.out.print(a + " ");
	}
}
