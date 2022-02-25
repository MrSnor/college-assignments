package Assignment4;

// Question :-
// Write a java program that uses a for loop. With the loop, make the variable x go from -2 to 
// 2, counting by 0.5. (This means that x can't be an int.) 
// -2.0
// -1.5
// -1.0
// -0.5
// 0.0
// 0.5
// 1.0
// 1.5
// 2.0

public class A4q2 {
    public static void main(String args[]) {
        for (double a = -2.0; a <= 2.0; a = a + 0.5)
            System.out.println(a);
    }
}
