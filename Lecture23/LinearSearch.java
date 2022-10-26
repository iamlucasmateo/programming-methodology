package Lecture23;

public class LinearSearch {
    public static void main(String[] args) {
        int[] myArr = {1, 4, 5, 7,3 ,6 ,2};
        System.out.println(linearSearch(myArr, 7));
        System.out.println(linearSearch(myArr, 12));
    }

    public static int linearSearch(int[] arr, int looked) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == looked) return i;
        }
        return -1;
    }
}
