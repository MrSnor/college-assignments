package Assignment5;

public class A5q10 {
    public static void main(String[] args) {
        sinFormula(1.57);
    }

    public static void sinFormula(double x) {
        double sum = x;
        double error = Math.pow(10, -3);
        double term = 0;
        int ncount = 1;
        while (true) {
            if (ncount % 2 == 1) {
                term = Math.pow(x, ncount + 2) / factorial2(ncount + 2);
            } else {
                term = -(Math.pow(x, ncount + 2) / factorial2(ncount + 2));
            }
            if (term < error) {
                break;
            }
            sum += term;
            ncount++;
        }
        System.out.println(sum);
    }

    static double factorial2(double i) {
        double product = 1;
        if (i == 0)
            return 1;
        return i * factorial2(i - 1);
    }

}
