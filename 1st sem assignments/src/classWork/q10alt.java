package classWork;

public class q10alt {
    public static void main(String[] args) {
        // * checking for nth prime number without using function/method
        int nth = 10;
        int primeCount = 0;
        int currentNum = 2;

        // the loop runs until primeCount isnt equal to
        // `required` nth prime count
        while (primeCount != nth) {
            boolean isPrime = true;
            int i = 2;
            // checking if currentNumber is prime
            for (; i <= Math.sqrt(currentNum); i++) {
                if (currentNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // increaments the prime-counter if CurrentNum is a prime and
            // prints it out
            if (isPrime) {
                System.out.print(currentNum + " ");
                primeCount++;
            }
            currentNum++;
        }
    }
}
