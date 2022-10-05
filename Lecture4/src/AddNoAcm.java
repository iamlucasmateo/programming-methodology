import java.util.Scanner;

public class AddNoAcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number1");
        int number1 = (int)scanner.nextByte();
        System.out.println("number2");
        int number2 = (int)scanner.nextByte();
        int result = number1 + number2;
        System.out.println("Result: " + result);
        scanner.close();
    }
}
