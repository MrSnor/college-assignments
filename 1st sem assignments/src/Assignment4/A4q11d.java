package Assignment4;

// Output -
//     1 
//    2 3
//   4 5 6
//  7 8 9 10
// 11 12 13 14 15
public class A4q11d {
    public static void main(String[] args) {
        pattern4(5);
    }

    public static void pattern4(int num) {
        int count = 1;
        // determines number of rows
        for (int i = 1; i <= num; i++) {
            // determines number of "space"(from left side only), at each/current row
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            // determines digits, at each/current row
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
