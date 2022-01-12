package Assignment2;

import java.util.Scanner;

public class A2q7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side : ");

        double side = in.nextDouble();
        double area = (3 * Math.sqrt(3) * side * side) / 2;
        System.out.print("The area of the hexagon is " + area);
    }
}
