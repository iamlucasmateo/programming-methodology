package ProgrammingAssignment5;

import java.util.Scanner;


public class GeneralaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Round round = new Round();
        while (round.roundOn()) {
            int[] possibleValues = round.rollDices();
            System.out.println(Round.stringify(possibleValues));
            String response = scanner.next();
            // replace with round.processResponse(response)
            int[] chosenValues = getChosenValues(response);
            round.setDiceValues(chosenValues);
        }
        scanner.close();
    }

    public static int[] getChosenValues(String response) {
        int[] result = {0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            result[i] = Character.getNumericValue(response.charAt(i));
        }
        return result;
    }
}
