package Assignment5;

// program for prime factorization

public class A5q20 {
    public static void main(String[] args) {
        primeFactorise(1111);
    }

    public static void primeFactorise(int num) {
        // no prime factorization possible if its already a prime number
        if (isPrime(num)) {
            System.out.println("Given number is prime");
        } else {
            var dividend = num;
            for (int divisor = 2; divisor <= num/2; divisor++) {
                if (isPrime(divisor)) {
                    while (dividend % divisor == 0) {
                        dividend = dividend / divisor;
                        System.out.print(divisor + " ");
                    }
                }
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
