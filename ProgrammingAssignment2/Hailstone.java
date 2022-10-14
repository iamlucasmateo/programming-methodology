package ProgrammingAssignment2;

import java.util.Scanner;

public class Hailstone {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter initial int");
        int starting = scanner.nextInt();
        runHailstoneSequence(starting);
        scanner.close();
    }

    public static void runHailstoneSequence(int starting) {
        int currentInt = starting;
        while (currentInt != 1) {
            if ((currentInt % 2) == 0) {
                int newInt = currentInt / 2;
                System.out.println(currentInt + " is even, so I divide by 2: " + newInt);
                currentInt = newInt;
            } else {
                int newInt = (3 * currentInt) + 1;
                System.out.println(currentInt + " is odd, so I change it to: " + newInt);
                currentInt = newInt;
            }
        }
        System.out.println("Final value is 1");
    }
}
