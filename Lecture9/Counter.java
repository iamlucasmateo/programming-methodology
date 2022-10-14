package Lecture9;

public class Counter {
    /* This is an instance variable
    *  Alternative: make it a class variable (static). 
    *  Problem with that is, each instance will modify the counter for all instances.
    */
    private int count;
    
    Counter(int initial) {
        this.count = initial;
    }
    
    Counter() {
        this.count = 0;
    }

    public int getNext() {
        this.count++;
        return this.count; 
    }
}