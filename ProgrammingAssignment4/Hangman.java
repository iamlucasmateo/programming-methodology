package ProgrammingAssignment4;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = getRandomWord();
        Game game = new Game(3, word);
        while (game.isOn()) {
            System.out.println(game.attempts);
            String status = UI.getWordRepresentation(game.wordStatus);
            System.out.println(status);
            char ch = scanner.next().charAt(0);
            game.processChar(ch);
        }
        scanner.close();
    }

    public static String getRandomWord() {
        int randomIndex = (int)(Math.random() * 4);
        String word = Lexicon.Lexicon.get(randomIndex);
        
        return word;
    }

}
