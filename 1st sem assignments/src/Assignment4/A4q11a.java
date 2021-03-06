package Assignment4;

// Output-
//      * 
//     * *
//    * * *
//   * * * *
//  * * * * *
public class A4q11a {

    public static void main(String[] args) {
        pattern1(5);
    }

    public static void pattern1(int num) {

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
}