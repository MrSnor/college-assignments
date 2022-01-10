package Assignment2;

import java.util.Scanner;

public class A2q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        float feet = in.nextFloat();
        
        System.out.println(feet + " feet is " + feet * 0.305);
    }
}