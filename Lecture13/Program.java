package Lecture13;

import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
        String rev = reverseString("abcd");
        System.out.println(rev);
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("abcbA") + "\n");
        System.out.println(replace("aaabgaag", 'a', 'x') + "\n");
        ArrayList<String> splitted = split("Such a nice place to live in", ' ');
        System.out.println(splitted + "\n");
        System.out.println(join(splitted));
        addByValue();
    }

    public static String reverseString(String myString) {
        String newString = "";
        for (int i = myString.length(); i >= 1; i--) {
            newString += myString.charAt(i - 1);
        }

        return newString;
    }

    public static boolean isPalindrome(String myString) {
        int i = 0;
        int strLen = myString.length();
        while ((i <= strLen / 2)) {
            if (myString.charAt(i) != myString.charAt(strLen - i - 1)) {
                return false;
            }
            i += 1;
        }

        return true;
    }

    public static String replace(String myString, char toReplace, char replaceBy) {
        String newString = "";
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if (ch == toReplace) {
                newString += replaceBy;
            } else {
                newString += ch;
            }
        }

        return newString;
    }

    public static ArrayList<String> split(String myString, char splitChar) {
        ArrayList<String> myList = new ArrayList<String>();
        String sub = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == splitChar) {
                myList.add(sub);
                sub = "";
            } else {
                sub += myString.charAt(i);
            }
        }

        return myList;
    }

    public static ArrayList<String> addByValue() {
        ArrayList<String> myArr = new ArrayList<String>();
        String first = "first";
        // what gets added here is the value
        myArr.add(first);
        // this modification does not affect the first add
        first = "last";
        myArr.add(first);
        System.out.println(myArr);

        return myArr;

    }

    public static String join(ArrayList<String> arr) {
        String newStr = "";
        for(String str:arr) {
            newStr += str;
        }

        return newStr;
    }
}
