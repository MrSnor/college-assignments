package classWork;

public class rough {
    public static void main(String[] args) {
        // int x = 12, y = 7, z = 9; // Line 5
        // z = (x < y) ? (x > z ? z : x) : (y < z ? z : y);
        // System.out.println(z);

        // var i = 2;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i > 6);
        Jik foo = new Jik(3,4);
        System.out.println(foo.x);
    }
}

class Jik {
    int x, y;

    Jik(int a, int b) {
        x = a;
        y = b;
    }
}