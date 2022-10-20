package Lecture19;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class UseIt {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("groceries");
        myList.add("notion");
        myList.add("future");
        Iterator<String> it = myList.iterator();
        // iterator interface
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    } 
}
