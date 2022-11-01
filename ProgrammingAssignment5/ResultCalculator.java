package ProgrammingAssignment5;

import java.util.HashMap;
import java.util.HashSet;


public class ResultCalculator {
    public static void main(String[] args) {
        ResultCalculator calculator = new ResultCalculator();
        Integer[] dice = {1, 1, 1, 2, 2};
        System.out.println(calculator.getResult(dice, "1"));
        System.out.println(calculator.getResult(dice, "2"));
        System.out.println(calculator.getResult(dice, "3"));
        Integer[] dice2 = {2, 1, 1, 2, 2};
        System.out.println(calculator.getResult(dice2, "FULL"));
        Integer[] dice3 = {3, 3, 3, 3, 3};
        System.out.println(calculator.getResult(dice3, "FULL"));
        System.out.println(calculator.getResult(dice3, "GENERALA"));
        Integer[] dice4 = {1, 5, 1, 2, 2};
        System.out.println(calculator.getResult(dice4, "FULL"));
        Integer[] dice5 = {1, 1, 1, 1, 2};
        System.out.println(calculator.getResult(dice5, "POKER"));
    }

    public static final HashSet<String> ALLOWED_RESULTS = ResultCalculator.getResultNames();
    
    private static HashSet<String> getResultNames() {
        HashSet<String> mySet = ResultCalculator.getNumberGames();
        mySet.add("FULL");
        mySet.add("GENERALA");
        mySet.add("POKER");
        mySet.add("ESCALERA");
        return mySet;
    }

    private static HashSet<String> getNumberGames() {
        HashSet<String> numberSet = new HashSet<String>();
        for (int i = 1; i < 7; i++) {
            numberSet.add(Integer.toString(i));
        }
        return numberSet;
    }


    public int getResult(Integer[] dices, String selectedGame) {
        if (selectedGame.equals("FULL")) {
            return getFullResult(dices);
        } else if (selectedGame.equals("POKER")) {
            return getPokerResult(dices);
        } else if (selectedGame.equals("GENERALA")) {
            return getGeneralaResult(dices);
        } else if (selectedGame.equals("ESCALERA")) {
            return getEscaleraResult(dices);
        } else if (getNumberGames().contains(selectedGame)) {
            return getNumberResult(dices, selectedGame);
        }
        return 0;
    }

    private int getFullResult(Integer[] dices) {
        HashMap<Integer, Integer> counts = Utils.countOcurrences(dices);
        if (counts.keySet().size() != 2) {
            return 0;
        } else if ((counts.values().contains(2)) && (counts.values().contains(3))){
            return 30;
        }
        return 0;
    }

    private int getPokerResult(Integer[] dices) {
        HashMap<Integer, Integer> counts = Utils.countOcurrences(dices);
        if (counts.keySet().size() != 2) {
            return 0;
        } else if ((counts.values().contains(1)) && (counts.values().contains(4))){
            return 40;
        }
        return 0;
    }

    private int getGeneralaResult(Integer[] dices) {
        HashMap<Integer, Integer> counts = Utils.countOcurrences(dices);
        if (counts.keySet().size() != 1) {
            return 0;
        } else if ((counts.values().contains(5))){
            return 50;
        }
        return 0;
    }

    private int getEscaleraResult(Integer[] dices) {
        Integer[] escalera1 = { 1, 2, 3, 4, 5 };
        Integer[] escalera2 = { 2, 3, 4, 5, 6 };
        if ((Utils.arraysAreEqual(dices, escalera1)) || (Utils.arraysAreEqual(dices, escalera2))) {
            return 20;
        } else {
            return 0;
        }
    }

    private int getNumberResult(Integer[] dices, String selectedNumber) {
        HashMap<Integer, Integer> counts = Utils.countOcurrences(dices);
        int selectedInt = Integer.parseInt(selectedNumber);
        if (counts.keySet().contains(selectedInt)) {
            return counts.get(selectedInt) * selectedInt;
        } else {
            return 0;
        }
    }
}
