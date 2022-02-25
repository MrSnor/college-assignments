package classWork;

// assignment question A4q11a
// Output-
//      * 
//     * *
//    * * *
//   * * * *
//  * * * * *

public class q13 {
    public static void main(String[] args) {
        loop1(6);
        System.out.println();
        // loop2(5)
    }

    // Using 2 inner "for" loops
    public static void loop1(int num) {

        // determines number of rows
        for (int i = 1; i <= num; i++) {
            // determines number of "space"(from left side only), at each/current row
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            // determines number of "*", at each/current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Using 1 loop(maybee more precisely, 1 inner loop) and condition
    public static void loop2() {

    }
}
