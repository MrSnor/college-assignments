package Assignment4;

// Output -
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
public class A4q11c {
    public static void main(String[] args) {
        pattern3(5);
    }

    public static void pattern3(int num) {
        // determines number of rows
        for (int i = 1; i <= num; i++) {
            // determines number of "space"(from left side only), at each/current row
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            // determines digits, at each/current row
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
