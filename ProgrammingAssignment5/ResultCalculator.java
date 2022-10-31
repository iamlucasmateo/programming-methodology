package ProgrammingAssignment5;

import java.util.HashSet;


public class ResultCalculator {
    public static final HashSet<String> ALLOWED_RESULTS = ResultCalculator.getResultNames();
    
    private static HashSet<String> getResultNames() {
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("FULL");
        return mySet;
    }


    public static int getResult(String selectedGame, int[] dices) {
        return 0;
    }
}
