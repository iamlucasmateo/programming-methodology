package Lecture17;

import java.util.ArrayList;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][3];
        populate(matrix1);
        printMatrix(matrix1);
    }

    public static int[][] populate(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        String result = "";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result += Integer.toString(matrix[i][j]) + " ";
            }
        }
        System.out.println(result);
    }
}
