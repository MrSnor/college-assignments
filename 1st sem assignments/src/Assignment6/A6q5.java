package Assignment6;

public class A6q5 {

    // program to give number of primes less than 10,000

    public static void main(String[] args) {
        int primeCount = 0;
        // start prime count from 2
        for (int i = 2; i <= 10_000; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        System.out.println("Number of primes less than 10,000 : " + primeCount);
    }

    static Boolean isPrime(int arg) {
        for (int i = 2; i <= Math.sqrt(arg); i++) {
            if (arg % i == 0)
                return false;
        }
        return true;
    }

}
