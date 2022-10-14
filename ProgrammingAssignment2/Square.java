package ProgrammingAssignment2;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double sumOfSquares = Math.pow(x, 2) + Math.pow(y, 2); 
        System.out.println("Hipotenusa");
        System.out.println(Math.sqrt(sumOfSquares));
        scanner.close();
    }
}
