package ProgrammingAssignment5;

import java.util.Scanner;


public class GeneralaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Round round = new Round();
        Controller controller = new Controller(round);
        while (round.roundOn()) {
            int[] rolledDice = round.rollDices();
            GeneralaMain.presentRound(rolledDice, round);
            boolean throwAgain = GeneralaMain.throwAgain(scanner);
            if (!throwAgain || round.getDiceThrows() == 0) {
                String selectedGame = GeneralaMain.getSelectedGame(scanner);
                System.out.println(round.processScore(rolledDice, selectedGame));
                break;
            }
        }

        scanner.close();
    }

    private static void presentRound(int[] possibleValues, Round round) {
        System.out.println("Dices: " + Round.stringify(possibleValues));
        System.out.println("Throws left " + round.getDiceThrows());
    }

    private static boolean throwAgain(Scanner scanner) {
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

    public static String getSelectedGame(Scanner scanner) {
        String response = "NO GAME";
        while (!ResultCalculator.ALLOWED_RESULTS.contains(response)) {
            System.out.println("Select result");
            response = scanner.next();
        }

        return response;
    }
}
