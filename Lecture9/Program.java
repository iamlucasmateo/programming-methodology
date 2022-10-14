package Lecture9;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int[] arr = new int[4]; 
        for(int arg : arr) {
            System.out.println(counter.getNext());
        };
    }
}
