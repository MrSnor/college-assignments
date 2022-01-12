package Assignment3;

import java.util.Scanner;

public class A3q8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age of Rahul, Ayush, Ajay : ");

        int rahulAge = in.nextInt();
        int ayushAge = in.nextInt();
        int ajayAge = in.nextInt();

        int m = Math.max(Math.max(rahulAge, ayushAge), Math.max(ayushAge, ajayAge));

        if (m == rahulAge)
            System.out.print("Rahul is Eldest");
        if (m == ayushAge)
            System.out.print("Ayush is Eldest");
        if (m == ajayAge)
            System.out.print("Ajay is Eldest");
    }
}
