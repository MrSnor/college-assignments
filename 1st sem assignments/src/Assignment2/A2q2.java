package Assignment2;

import java.util.Scanner;

public class A2q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final float PIE = 3.14F;
        System.out.print("Enter the radius and length of a cylinder: ");
        float radius = sc.nextFloat();
        float length = sc.nextFloat();

        float area = radius * radius * PIE;
        float volume = area * length;

        System.out.println("The area is " + area + "\n" + "The volume is " + volume);
    }
}
