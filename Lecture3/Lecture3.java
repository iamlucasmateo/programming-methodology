/*

Some ideas from the lecture
Long comments

- Pre-conditions and post-conditions in methods
- Step-wise refinements: decomposition (top-down design)

*/

package Lecture3;

import java.util.Random;

public class Lecture3 {
    public static void main(String[] args) {
        int rounds = whileStructure(0.7);
        System.out.println("Rounds: " + rounds);
    }

    /*  
    while loop using a function as condition
    caveat: beware of infinite loops
    */
    public static int whileStructure(double limit) {
        int rounds = 0;
        while (getRandomBoolean(limit)) {
            System.out.println("Still looping");
            rounds++;
        }
        // "Off by one bug" (OBOB): do something after you come out of the loop
        System.out.println("Got out of loop");
        
        return rounds;
    }

    public static boolean getRandomBoolean(double limit) {
        Random rand = new Random();
        return rand.nextFloat() < limit;
    }
}