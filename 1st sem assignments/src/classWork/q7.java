package classWork;
// assignment question A4q5

public class q7 {
    public static void main(String[] args) {
        int sum, product;
        sum = 0;
        product = 1;
        for (int i = 0; i <= Integer.parseInt(args[0]); i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                product *= i;
            }
        }

        System.out.println("sum of evens = " + sum);
        System.out.println("product of odds = " + product);
    }
}
