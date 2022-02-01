package classWork;

public class q5alt {
    public static void main(String[] args) {
        // * checking prime without using function/method
        int n = 1729;
        int i = 2;
        boolean isPrime = true;
        for (; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                System.out.println(i);
            }
        }
        if (isPrime) {
            System.out.println("its Prime");
        } else {
            System.out.println("its not Prime");
        }
    }
}
