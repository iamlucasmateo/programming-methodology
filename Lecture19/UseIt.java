package Lecture19;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;

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

        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "Mapa");
        myMap.put(2, "Vida");
        myMap.put(3, "Loqui");
        Iterator hashMapIt = myMap.keySet().iterator();
        while (hashMapIt.hasNext()) {
            // why is this an "Object"
            Object key = hashMapIt.next();
            String name = myMap.get(key);
            System.out.println(key);
            System.out.println(name);
        }

    } 
}
