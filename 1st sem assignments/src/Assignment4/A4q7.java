package Assignment4;

/*
Question : Write a program to find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

/*
Output : 
The sum if the squares of the first ten natural numbers is, 338350
The square of the sum of the first ten natural numbers is, 25502500
Hence the diffenece between the sum of the squares if the first ten natural numbers and the square of the sum is 25502500 - 338350 = 25164150
*/
public class A4q7 {
    public static void main(String args[]) {
        int sum1 = 0;
        for (int a = 1; a <= 100; a++) {
            sum1 = sum1 + a * a;
        }
        System.out.println("The sum of the squares of the first hundred natural numbers is, " + sum1);
        int sum2 = 0;
        for (int a = 1; a <= 100; a++) {
            sum2 = sum2 + a;
        }
        sum2 = sum2 * sum2;
        System.out.println("The square of the sum of the first hundred natural numbers is, " + sum2);
        System.out.println(
                "Hence the diffenece between the sum of the squares if the first hundred natural numbers and the square of the sum is "
                        + sum2 + " - " + sum1 + " = " + (sum2 - sum1));
    }
}
