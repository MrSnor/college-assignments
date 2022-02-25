package Assignment4;

// Output -
//     1 
//    1 2 
//   1 2 3
//  1 2 3 4 
// 1 2 3 4 5

public class A4q11b {
    public static void main(String[] args) {
        pattern2(5);
    }

    public static void pattern2(int num) {

        // determines number of rows
        for (int i = 1; i <= num; i++) {
            // determines number of "space"(from left side only), at each/current row
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            // determines digits, at each/current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
