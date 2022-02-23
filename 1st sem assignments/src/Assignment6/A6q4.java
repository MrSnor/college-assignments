package Assignment6;

public class A6q4 {
    public static void main(String args[]) {
        int s = 0;
        for (int a = 2000; a <= 2020; a++) {
            s = s + numberOfDaysInAYear(a);

            // if (numberOfDaysInAYear(a) == 366)
            //     System.out.print(a + " ");
        }
        System.out.println("Sum is: " + s);
    }

    public static int numberOfDaysInAYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0)
                return 366;
            else if (year % 400 == 0)
                return 366;
            else
                return 365;
        } else {
            return 365;
        }

    }
}
