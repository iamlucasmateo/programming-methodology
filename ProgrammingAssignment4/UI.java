package ProgrammingAssignment4;

public class UI {
    public static String getWordRepresentation(String word) {
        String rep = "";
        for (int i = 0; i < word.length(); i++) {
            String next = Character.toString(word.charAt(i)) + " ";
            rep += next;
        }
        
        return rep;
    }
}
