package Assignment5;

// loooks correct most likely
public class A5q10 {
    public static void main(String[] args) {
        sinFormula(45);
    }

    public static void sinFormula(double x) {
        x = Math.toRadians(x);
        // variable to be used for the infinite sum
        double sum = x;
        double error = Math.pow(10, -6);
        // term for EACH sum
        double term = 0;
        int ncount = 1;
        int counter = 1;
        while (true) {
            if (counter % 2 == 1) {
                term = -(Math.pow(x, ncount + 2) / factorial(ncount + 2));
            } else {
                term = Math.pow(x, ncount + 2) / factorial(ncount + 2);
            }
            if (Math.abs(term) < error) {
                break;
            }
            sum += term;
            ncount += 2;
            counter++;
        }
        // showing the value to 2 places after decimal
        System.out.println(String.format("%.2f",sum)); // string formatting
    }

    static double factorial(double i) {
        int product = 1;
        for (double j = i; j > 0; j--) {
            product*=j;
        }
        return product;
    }

}
