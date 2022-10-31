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

    public void processResponse(String response) {
        if (response.length() != 5) {
            throw new IllegalArgumentException("Response must be 5 characters long");
        }
        int[] result = {0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            int num = Character.getNumericValue(response.charAt(i));
            if (num > 6) {
                throw new IllegalArgumentException("The value " + num + " is not allowed, only numbers from 0 to 6");
            }
            result[i] = num;
        }
        setDiceValues(result);
    }

    private void setDiceValues(int[] chosenValues) {
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
        return diceThrows > 0;
    }

    public int getDiceThrows() {
        return diceThrows;
    }

    public int processScore(int[] rolledDice, String selectedGame) {
        return 20;
    }
}
