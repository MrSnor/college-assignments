package classWork;

public class q10 {
    static Boolean isPrime(int arg) {
        for (int i = 2; i <= Math.sqrt(arg); i++) {
            if (arg % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int primeReq = 7;
        int primeCount = 0;
        int numCount = 2;
        while (primeCount != primeReq) {
            if (isPrime(numCount)) {
                System.out.print(numCount + " ");
                primeCount++;
            }
            numCount++;
        }
    }
}
