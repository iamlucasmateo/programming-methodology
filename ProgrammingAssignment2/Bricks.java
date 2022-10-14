package ProgrammingAssignment2;

public class Bricks {
    public static void main(String[] args) {
        System.out.println("\n");
        int TOTAL_ROWS = 7;
        int thisRow = TOTAL_ROWS;
        while (thisRow > 0) {
            String leftShift = "";
            for (int j = 0; j < TOTAL_ROWS - thisRow; j++) {
                leftShift += " ";
            }

            String rowStr = leftShift;
            for (int i = 0; i < thisRow; i++) {
                rowStr += "* ";
            };
            System.out.println(rowStr);
            thisRow -= 1;
        }
    }

}
