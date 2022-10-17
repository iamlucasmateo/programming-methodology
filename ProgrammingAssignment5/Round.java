package ProgrammingAssignment5;

public class Round {
    private int diceThrows = 3;
    private int[] diceValues = {0, 0, 0, 0, 0};

    public int[] rollDices() {
        int[] possibleNewValues = {0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            if (diceValues[i] == 0) {
                possibleNewValues[i] = Dice.roll();
            } else {
                possibleNewValues[i] = diceValues[i];
            }
        }

        this.diceThrows -= 1;

        return possibleNewValues;
    }

    public void setDiceValues(int[] chosenValues) {
        for (int i = 0; i < 5; i++) {
            if (diceValues[i] == 0) {
                diceValues[i] = chosenValues[i];
            }
        }
    }

    public static String stringify(int[] myArr) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += " " + myArr[i];
        }

        return result;
    }

    public boolean roundOn() {
        System.out.println(Round.stringify(diceValues));
        System.out.println(diceThrows);
        return diceThrows > 0;
    }
}
