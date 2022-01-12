package Assignment2;

import java.util.Scanner;

public class A2q6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Weight in pounds : ");
        float p = in.nextFloat();

        System.out.print("Enter height in inches : ");
        float i = in.nextFloat();

        float m = i * 0.0254F;
        float k = p * 0.45359237F;
        float bmi = k / (m * m);

        System.out.println("BMI is "+ bmi);
    }
}
