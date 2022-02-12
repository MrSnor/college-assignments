package classWork;

public class q11 {
    // [12:04 pm] ARKA CHAKRABORTY: Write a function 
    // to generate reverse of a integer number
    public static void reverse(int num) {
        String revNum = "";
        while (num>0) {
            revNum+=num%10;
            num/=10;
        }
        System.out.println(Integer.parseInt(revNum));
    }
    public static void main(String[] args) {
        reverse(053);
    }
}
