package Assignment3;

import java.util.Scanner;

public class A3q6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f : ");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        double productDiff = a * d - b * c;

        if (productDiff == 0) {
            System.out.print("The equation has no solution");
        } else {
            double x = (e * d - b * f) / productDiff;
            double y = (a * f - e * c) / productDiff;

            System.out.print("x is " + x + " and " + "y is " + y);
        }
    }
}
