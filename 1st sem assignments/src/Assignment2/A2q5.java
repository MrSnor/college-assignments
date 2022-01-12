package Assignment2;

import java.util.Scanner;

public class A2q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter v0, v1 and t : ");

        float v0 = sc.nextFloat(), v1 = sc.nextFloat(), t = sc.nextFloat();
        float acceleration = (float) ((v1 - v0) / t);

        System.out.print("The average accelaration is " + acceleration);
    }
}
