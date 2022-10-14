package SectionAssignment4;

public class Ex1 {
    public static void main(String[] args) {
        int NUMBER = 7145243;
        System.out.println(addCommasToNumericString(NUMBER));
    }

    public static String addCommasToNumericString(int number) {
        String strNumber = "" + number;
        int strNumberLength = strNumber.length();
        String result = "";
        int chunk = 0;
        
        for (int i = 1; i <= strNumberLength; i++) {
            result = strNumber.charAt(strNumberLength - i) + result;
            chunk += 1;
            if ((chunk == 3) && (i != strNumberLength)) {
                result = "," + result;
                chunk = 0;
            }
        }

        return result;
    } 
}
