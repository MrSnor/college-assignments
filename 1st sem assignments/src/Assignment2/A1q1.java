package Assignment2;

import java.util.Scanner;

public class A1q1 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter temperature in degree Celsius : ");
            double celcius = in.nextDouble();
            double Fahrenheit = (9 / 5.0) * celcius + 32;
            System.out.print(celcius + " Celsius is " + Fahrenheit + " Fahrenheit");
        }
    }
}
