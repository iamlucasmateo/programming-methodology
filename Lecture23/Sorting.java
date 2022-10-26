package Lecture23;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Sorting {
    public static void main(String[] args) {
        List<Integer> myArr = getList();
        printArray(myArr);
        System.out.println(selectionSort(myArr));
    }

    private static List<Integer> getList() {
        List<Integer> list = new ArrayList<Integer>(); 
        int[] original = { 5, 2, 56, 8, 23, 3, 7, 23, 235, 68, 8 };
        for (int i = 0; i < original.length; i++) {
            list.add(original[i]);
        }

        return list;
    }

    private static List selectionSort(List<Integer> arr) {
        /* 
         * Iterate from the left, find the min for the remainig array, swap
        */
        for (int i = 0; i < arr.size() - 1; i++) {
            int value = arr.get(i);
            int minValue = value;
            int minIndex = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < minValue) {
                    minIndex = j;
                    minValue = arr.get(j);
                }
            }
            arr.set(i, minValue);
            arr.set(minIndex, value);
        }

        return arr;
    }

    private List radixSort(List<Integer> arr) {
        return new ArrayList<Integer>();
    }

    private static void printArray(List arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
    
}
