package ProgrammingAssignment4;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = getRandomWord();
        Game game = new Game(3, word);
        while (game.isOn()) {
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
