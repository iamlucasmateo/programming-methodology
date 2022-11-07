package ProgrammingAssignment5;

import java.util.Scanner;


public class GeneralaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(scanner);
        ResultCalculator resultCalculator = new ResultCalculator();
        Round round = new Round();
        Integer[] rolledDice = {0, 0, 0, 0, 0};
        while (round.roundOn()) {
            rolledDice = round.rollDices();
            GeneralaMain.presentRound(rolledDice, round);
            if (round.getDiceThrows() != 0 && inputHandler.throwAgain()) {
                Integer[] selectedDices = inputHandler.selectDices(rolledDice);
                round.setDiceValues(selectedDices);
            } else {
                break;
            }
        }
        String selectedGame = inputHandler.getSelectedGame();
        System.out.println("Puntos: " + resultCalculator.getResult(rolledDice, selectedGame));

        scanner.close();
    }

    private static void presentRound(Integer[] possibleValues, Round round) {
        System.out.println("Dices: " + Round.stringify(possibleValues));
        System.out.println("Throws left " + round.getDiceThrows());
    }

}
