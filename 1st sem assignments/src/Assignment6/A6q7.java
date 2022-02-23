package Assignment6;

public class A6q7 {

    public static void main(String args[]) {
        for (int a = 2; a <= 1000; a++) {
            if (isPrime(a) && isPrime(a + 2)) {
                System.out.println(String.format("(%d,%d)", a, a + 2));
                // System.out.println("("+a+","+(a+2)+")");
            }
        }
    }

    static Boolean isPrime(int arg) {
        for (int i = 2; i <= Math.sqrt(arg); i++) {
            if (arg % i == 0)
                return false;
        }
        return true;
    }
}