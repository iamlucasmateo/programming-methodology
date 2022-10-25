package ProgrammingAssignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.io.File;

public class Lexicon {
    public static HashMap<Integer, String> Lexicon = buildLexicon();
    public static final String LEXICON_FILE = "./ProgrammingAssignment4/lexicon.txt";
    
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        File dir = new File("./ProgrammingAssignment4");
        for (String fileName: dir.list()) {
            System.out.println(fileName);
        }
    }

    public static HashMap<Integer, String> buildLexicon() {
        HashMap<Integer, String> lexicon = new HashMap<Integer, String>();
        BufferedReader reader = new BufferedReader(new FileReader("ProgrammingAssignment4/lexicon.txt"));
        // reader.close();
        // lexicon.put(0, "Lexicographic");
        // lexicon.put(1, "Enciclopedia");
        // lexicon.put(2, "Bibliography");
        // lexicon.put(3, "Psychopathology");
        
        return lexicon;
    }
}
