package classWork;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score( 0-100 ): ");

        int score = sc.nextInt();

        switch (score / 10) {

            case 10:
                System.out.println("Grade: OP \nps. are you from area 51?");
                break;

            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
                System.out.println("Grade: B");
                break;

            case 7:
                System.out.println("Grade: C");
                break;

            case 6:
                System.out.println("Grade: D");
                break;

            case 5:
                System.out.println("Grade: E");
                break;

            default:
                System.out.println("Grade: efF");
                break;
        }
    }
}
