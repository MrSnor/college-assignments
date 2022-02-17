package classWork;
// assignment problem A5q8
public class q16 {
    public static void main(String[] args) {
        System.out.println(factorial1(3));
        System.out.println(factorial2(3));
    }

    public static int factorial1(int i) {
        int product = 1;
        for (int j = i; j > 0; j--) {
            product*=j;
        }
        return product;
    }

    static int factorial2(int i) {
        if (i == 0)
            return 1;
        return i * factorial2(i - 1);
    }
}
