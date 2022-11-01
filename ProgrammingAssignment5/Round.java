package ProgrammingAssignment5;

public class Round {
    private int diceThrows = 3;
    private Integer[] diceValues = {0, 0, 0, 0, 0};

    public Integer[] rollDices() {
        Integer[] possibleNewValues = {0, 0, 0, 0, 0};
        for (Integer i = 0; i < 5; i++) {
            if (diceValues[i] == 0) {
                possibleNewValues[i] = Dice.roll();
            } else {
                possibleNewValues[i] = diceValues[i];
            }
        }

        this.diceThrows -= 1;

        return possibleNewValues;
    }

    public void setDiceValues(Integer[] chosenValues) {
        for (int i = 0; i < 5; i++) {
            if (diceValues[i] == 0) {
                diceValues[i] = chosenValues[i];
            }
        }
    }

    public static String stringify(Integer[] myArr) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += " " + myArr[i];
        }

        return result;
    }

    public boolean roundOn() {
        return diceThrows > 0;
    }

    public void endRound() {
        diceThrows = 0;
    }

    public int getDiceThrows() {
        return diceThrows;
    }

}
