package Lecture23;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArr = { 1,4,7,12,15,18,23,26,29,36,38,47,59 };
        System.out.println(binarySearch(myArr, 18));
        System.out.println(binarySearch(myArr, 21));
    }

    public static int binarySearch(int[] arr, int value) {
        return binarySearchRec(arr, value, 0, arr.length);
    }

    public static int binarySearchRec(int[] arr, int value, int leftIndex, int rightIndex) {
        int middleIndex = leftIndex / 2 + rightIndex / 2;
        if (leftIndex != rightIndex) {
            if (arr[middleIndex] == value) {
                return middleIndex;
            }
            if (arr[middleIndex] < value) {
                return binarySearchRec(arr, value, middleIndex + 1, rightIndex);
            }
            if (arr[middleIndex] > value) {
                return binarySearchRec(arr, value, leftIndex, middleIndex - 1);
            }
        }
        if (arr[leftIndex] == value) return leftIndex;
        return -1;
    }

    public static int binarySearch(int[] arr, int value, int leftIndex, int rightIndex) {
        while (leftIndex != rightIndex) {
            int middleIndex = leftIndex / 2 + rightIndex / 2;
            if (arr[middleIndex] == value) return middleIndex;
            if (arr[middleIndex] < value) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1; 
            }
        }
        
        if (arr[leftIndex] == value) return leftIndex;
        
        return -1;        
    }

    private static int[] sliceArray(int[] myArr, int leftIndex, int rightIndex) throws Exception {
        if (leftIndex > rightIndex) {
            throw new Exception("to");
        }
        int[] newArr = new int[rightIndex - leftIndex];
        for (int i = 0; i < rightIndex - leftIndex; i++) {
            newArr[i] = myArr[leftIndex + i];  
        }
        return newArr;
    }
}
