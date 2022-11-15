package ProgrammingAssignment5;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean throwAgain() {
        String response;
        while (true) {
            System.out.println("Throw again Y/N?");
            response = scanner.next();
            if (response.equals("Y")) {
                return true;
            } else if (response.equals("N")) {
                return false;
            } else {
                System.out.println("You should answer Y/N");
            }
        }
    }

    public String getSelectedGame() {
        String response = "NO GAME";
        while (!ResultCalculator.ALLOWED_RESULTS.contains(response)) {
            System.out.println("Select result");
            response = scanner.next();
        }

        return response;
    }

    public Integer[] selectDices(Integer[] rolledDice) {
        String response;
        Integer[] result = {0, 0, 0, 0, 0};
        boolean inputOk = false;
        while (!inputOk) {
            System.out.println("Select your game");
            response = scanner.next();
            if (response.length() != 5) {
                System.out.println("Response must be 5 characters long");
                continue;
            }
            for (int i = 0; i < 5; i++) {
                int num = Character.getNumericValue(response.charAt(i));
                int allowedValue = rolledDice[i];
                int processedNum = processDice(num, allowedValue);
                if (processedNum == -1) {
                    break;
                }
                result[i] = processedNum;
                if (i == 4) {
                    inputOk = true;
                }
            }
        }
        return result;
    }

    private int processDice(int num, int allowedValue) {
        if (num > 6) {
            System.out.println("The value " + num + " is not allowed, only numbers from 0 to 6");
            return -1; 
        }
        if ((num != 0 && num != allowedValue)) {
            System.out.println("Allowed value is " + allowedValue);
            System.out.println("You entered " + num);
            return -1;
        }
        return num;
    }
}
