package Assignment4;

// Question : Write a java program to print the multiplication table of a number entered by the user.

// Output :
/*
 Enter a no. for which you want to find the multiplication table: 8
8x1=8
8x2=16
8x3=24
8x4=32
8x5=40
8x6=48
8x7=56
8x8=64
8x9=72
8x10=80
 */

public class A4q6 {
    public static void main(String args[]) {
        System.out.print("Enter a no. fow which you want to find the multiplication table :");
        int i = Integer.parseInt(args[0]);
        for (int a = 1; a <= 10; a++) {
            System.out.println(i + "x" + a + "=" + (i * a));
        }
    }
}
