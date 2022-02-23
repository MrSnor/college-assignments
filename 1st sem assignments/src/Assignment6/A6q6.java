package Assignment6;

// program to check for both prime and palindrome 
// and print nth of such numbers

public class A6q6 {
    public static void main(String args[]) {
        int c = 0;
        for (int a = 2; c < 100; a++) {
            if (isPrime(a) && isPalindrome(a)) {
                System.out.print(a + "\t");
                c++;
                if (c % 10 == 0)
                    System.out.println();
            }
        }
    }

    static int reverse(int n) {
        int s = 0;
        while (n > 0) {
            s = (s * 10) + (n % 10);
            n /= 10;
        }
        return s;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    static Boolean isPrime(int arg) {
        for (int i = 2; i <= Math.sqrt(arg); i++) {
            if (arg % i == 0)
                return false;
        }
        return true;
    }
}
