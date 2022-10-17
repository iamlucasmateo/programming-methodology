package ProgrammingAssigment4;

public class Game {
    private int attempts;
    private String word;
    private String wordStatus;
    
    Game(int attempts, String word) {
        this.attempts = attempts;
        this.word = word;
        // this internal representation could be different maybe
        this.wordStatus = getInitWordStatus(word);
    }

    public boolean isOn() {
        System.out.println(attempts);
        System.out.println(wordStatus);
        return (attempts > 0) && (wordStatus.indexOf("_") != -1);
    }

    public void processChar(char ch) {
        String newWordStatus = "";
        boolean reduceAttempts = true;
        System.out.println(ch);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                System.out.println("here");
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
