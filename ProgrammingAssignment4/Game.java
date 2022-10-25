package ProgrammingAssignment4;

public class Game {
    public int attempts;
    private String word;
    public String wordStatus;
    
    Game(int attempts, String word) {
        this.attempts = attempts;
        this.word = word;
        // this internal representation could be different maybe
        this.wordStatus = getInitWordStatus(word);
    }

    public boolean isOn() {
        return (attempts > 0) && (wordStatus.indexOf("_") != -1);
    }

    public void processChar(char ch) {
        String newWordStatus = "";
        boolean reduceAttempts = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                newWordStatus += ch;
                reduceAttempts = false;
            } else {
                newWordStatus += wordStatus.charAt(i);
            }
        }

        wordStatus = newWordStatus;
        
        if (reduceAttempts) {
            attempts -= 1;
        }
    }

    private String getInitWordStatus(String word) {
        /*
         * The internal representation of a word is give like so:
         * L______
         * L_exi__gr___y
         */
        String wordStatus = Character.toString(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            wordStatus += "_";
        }

        return wordStatus;
    }

    public String getWordStatus() {
        return wordStatus;
    }

    public int getRemainingAttempts() {
        return attempts;
    }
}
