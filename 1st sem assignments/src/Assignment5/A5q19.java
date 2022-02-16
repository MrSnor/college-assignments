package Assignment5;

public class A5q19 {
    public static void main(String[] args) {
        System.out.println(binaryConv(40));
    }

    public static String binaryConv(int x) {
        String rem = "";
        while (x > 0) {
            // concatenating remainders in front
            rem = (x % 2) + rem;
            x = x / 2;
        }
        return rem;
    }
}
