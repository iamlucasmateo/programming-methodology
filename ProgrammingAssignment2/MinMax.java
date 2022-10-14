package ProgrammingAssignment2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MinMax {
    /**
     * Create a list of ints from user input, prints min and max
     * @param args
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        
        while (true) {
            System.out.println("Enter int");
            try {
                int entered = scanner.nextInt();
                if (entered == 0) break;
                numbers.add(entered);
            } catch(InputMismatchException e) {
                // This is missing something
                System.out.println("That was not an int");
            };
        };

        System.out.println(numbers.toString());
        System.out.println(Collections.min(numbers));
        System.out.println(Collections.max(numbers));
        scanner.close();
    }
}
