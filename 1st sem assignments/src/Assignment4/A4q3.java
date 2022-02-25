package Assignment4;

// Question :-
// Write a java program to print the following output using loop.
// 1
// 121
// 1213121
// 121312141213121
// 1213121412131215121312141213121

public class A4q3 {
    public static void main(String args[]) {
        int numberOfRows = 5;
        String s = "";
        for (int a = 1; a <= numberOfRows; a++) {
            s = s + a + s;
            System.out.println(s);
        }
    }
}
