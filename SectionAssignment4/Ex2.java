package SectionAssignment4;

public class Ex2 {
    public static void main(String[] args) {
        String MY_STRING = "agasfbabhjkaatrgnbjka";
        char MY_CHAR = 'a';
        String result = removeAllOcurrences(MY_STRING, MY_CHAR);
        System.out.println(result);
    }

    public static String removeAllOcurrences(String myString, char myChar) {
        String result = "";
        
        for (char character: myString.toCharArray()) {
            if (character != myChar) {
                result += character;
            }
        }

        return result; 
    }
}
