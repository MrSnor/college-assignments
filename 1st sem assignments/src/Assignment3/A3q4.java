package Assignment3;

import java.util.Scanner;

public class A3q4 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a Charecter: ");
		char ch = in.nextLine().charAt(0);

		// implicit type casting is done when comapring char and int
		if (65 <= ch && 90 >= ch)
			System.out.print(ch + " is Capital Letter");
		else if (97 <= ch && 122 >= ch)
			System.out.print(ch + " is Small Letter");
		else if (48 <= ch && 57 >= ch)
			System.out.print(ch + " is a Numeral");
		else
			System.out.print(ch + " is a Special Character");
	}
}
