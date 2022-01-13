package classWork;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two values: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter the operation you want: ");
        // char ch = sc.nextLine().charAt(0);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                break;
        }

    }
}
