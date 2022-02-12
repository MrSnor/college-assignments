package classWork;

// assignment question
public class q13 {
    // Using 2 loops
    public static void loop1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Using 1 loop and condition
    public static void loop2() {
        
    }
    public static void main(String[] args) {
        loop1(6);
        System.out.println();
        // loop2(5)
    }
}
