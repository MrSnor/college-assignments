package classWork;

public class q9 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int sum = 0;
        for (; num > 0; num /= 10) {
            sum += num % 10;
        }
        System.out.println(sum);
    }
}
