package Assignment3;

public class OrTest {
    public static void main(String[] args) {

        int a, b, c;
        a = 3;
        b = 4;
        c = 7;

        if (a > b || a > c) {
            System.out.println("yes a is not smallest");
        }
        else if (a == 3) {
            System.out.println("a is equal to 3");
        }
        else {
            System.out.println(" a is smallest");
        }
    }
}
