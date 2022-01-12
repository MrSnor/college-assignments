package Assignment2;

import java.util.Scanner;

public class A2q10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        double x1, x2, x3, y1, y2, y3, s, side1, side2, side3, area;

        System.out.print("Enter three points for a triangle: ");

        x1 = in.nextDouble();
        y1 = in.nextDouble();

        x2 = in.nextDouble();
        y2 = in.nextDouble();

        x3 = in.nextDouble();
        y3 = in.nextDouble();

        side1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        side2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        side3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

        s = side1 + side2 + side3;
        s = s / 2.0;
        
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of Triangle is " + area);
    }
}
