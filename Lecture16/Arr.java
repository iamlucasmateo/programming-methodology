package Lecture16;

import java.util.ArrayList;


public class Arr {
    public static void main(String[] args) {
        // arrays are passed by reference
        int[] myArr = new int[5];
        myArr[0] = 6;
        int[] myArr2 = myArr;
        System.out.println(stringifyArray(myArr2));
        myArr2[1] = 7;
        System.out.println(stringifyArray(myArr));

        // swapping
        // nothing happens
        swapBuggy(myArr[0], myArr[1]);
        System.out.println(stringifyArray(myArr));
        // ok
        swapHappy(myArr, 0, 1);
        System.out.println(stringifyArray(myArr));

        // use of i++
        int SIZE = 5;
        int[] someArr = new int[SIZE];
        int numScores  = 0;

        while (numScores < SIZE) {
            someArr[numScores++] = (int)(Math.random() * 10);
        }
        System.out.println(stringifyArray(someArr));
    }

    public static String stringifyArray(int[] myArr) {
        String result = "";
        for (int el:myArr) {
            result += Integer.toString(el) + " ";
        }

        return result;
    }

    public static void swapBuggy(int x, int y) {
        // just the primitves got passed
        int temp = y;
        y = x;
        x = temp;
    }

    public static void swapHappy(int[] arr, int pos0, int pos1) {
        int temp = arr[pos0];
        arr[pos0] = arr[pos1];
        arr[pos1] = temp;
    }
}
