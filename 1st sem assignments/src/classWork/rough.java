package classWork;

public class rough {
    public static void main(String[] args) {

        rect ob = new rect();
        ob.getData(10, 2);
        int x = ob.area();
        System.out.println(x);

    }
    
}

class rect {
    int l, b;

    void getData(int x, int y) {
        l = x;
        b = y;
    }

    int area() {
        return l * b;

    }
}

class Jik {
    int x, y;

    Jik(int a, int b) {
        x = a;
        y = b;
    }
}