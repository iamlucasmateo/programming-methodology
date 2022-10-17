/*
* Implementing some char methods
*/

package Lecture12;

public class Program {
    public static void main(String[] args) {
        char d = 'd';
        System.out.println(toUpper(d));
        System.out.println(isDigit(d));
        System.out.println(isDigit('7'));
    }

    public static char toUpper(char myChar) {
        if ((myChar >= 'a') && (myChar <= 'z')) {
            return (char)(myChar - 'a' + 'A');
        }
        
        return myChar;
    }

    public static boolean isDigit(char myChar) {
        if ((myChar >= '0') && (myChar <= '9')) {
            return true;
        }
        return false;
    }


}
