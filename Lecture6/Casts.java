package Lecture6;

public class Casts {
    // This is how you would declare a CONSTANT in Java 
    private static final double PI = 3.141519;
    public static void main(String[] args) {
        int int1 = 5;
        int int2 = 2;
        // Result: int, 2
        System.out.println(int1/int2);

        double funkyResult = int1 / int2;
        // Result: double, 2.0 (first the integer division takes place, then the int is converted for the assignment)
        System.out.println(funkyResult);

        double okResult = (double)int1 / int2;
        // Casting takes place before, so the result is correct
        System.out.println(okResult);

        double okResult2 = int1 / 2.0;
        // Casting because of 2.0
        System.out.println(okResult2);
        
        // This doesn't compile
        // int truncated = int1 / 2.0;

        System.out.println(PI);
    }
}
