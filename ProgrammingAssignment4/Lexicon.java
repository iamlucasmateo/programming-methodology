package ProgrammingAssignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lexicon {
    public static HashMap<Integer, String> Lexicon = buildLexicon();
    public static final String LEXICON_FILE = "ProgrammingAssignment4/lexicon.txt";
    
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        File dir = new File("./ProgrammingAssignment4");
        for (String fileName: dir.list()) {
            System.out.println(fileName);
        }
        HashMap<Integer, String> lexicon = buildLexicon();
        System.out.println(lexicon);
    }

    public static HashMap<Integer, String> buildLexicon() {
        HashMap<Integer, String> lexicon = new HashMap<Integer, String>();
        FileReader fr;
        try {
            fr = new FileReader(LEXICON_FILE);
        } catch (FileNotFoundException exc) {
            System.out.println(exc);
            return lexicon;
        }
        BufferedReader reader = new BufferedReader(fr);
        int i = 0;
        while (true) {
            try {
                String line = reader.readLine();
                if (line == null) break;
                lexicon.put(i, line);
                i++;
            } catch (IOException exc) {};
        }
        
        try {
            reader.close();
        } catch (IOException exc) {
            return lexicon;
        }
        
        return lexicon;
    }
}
