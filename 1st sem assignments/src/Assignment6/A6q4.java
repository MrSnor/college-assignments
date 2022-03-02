package Assignment6;

public class A6q4 {
    public static void main(String args[]) {
        System.out.println(numberOfDaysInAYear(2000));
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
