public class Assignment5 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int i) {
        int product = 1;
        if (i == 0)
            return 1;
        return product * factorial(i - 1);
    }
}
