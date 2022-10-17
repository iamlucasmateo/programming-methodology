package ProgrammingAssigment4;

import java.util.HashMap;

public class Lexicon {
    public static HashMap<Integer, String> Lexicon = buildLexicon();
    public static HashMap<Integer, String> buildLexicon() {
        HashMap<Integer, String> lexicon = new HashMap<Integer, String>();
        lexicon.put(0, "Lexicographic");
        lexicon.put(1, "Enciclopedia");
        lexicon.put(2, "Bibliography");
        lexicon.put(3, "Psychopathology");
        
        return lexicon;
    }
}
