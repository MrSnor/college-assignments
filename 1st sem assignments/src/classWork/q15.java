package classWork;
// prolly in assignment 5

public class q15 {
    public static void seriesSum(int Nth) {

        int sum = 0;
        // 'an' term
        int an = 0;
        for (int count = 1; count <= Nth; count++) {
            if (count % 2 == 1)
                an = (2 * count) - 1;
            else an = -((2 * count) - 1);
            
            System.out.print(an + " ");
            if (count % 2 == 1) {
                sum += an;
            }
            if (count % 2 == 0) {
                sum += an;
            }

            if (count == Nth) {
                System.out.println();
            }

        }

        System.out.println(sum);

    }

    public static void main(String[] args) {
        seriesSum(9);
    }
}
