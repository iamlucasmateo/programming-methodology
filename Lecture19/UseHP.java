package Lecture19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class UseHP {
    public static void main(String[] args) {
        // declaring the interface
        Map<String, String> dict = new HashMap<String, String>();
        // the interface implements put and get methods
        dict.put("word", "definition");
        dict.put("hangman", "fear");
        dict.put("breakout", "arkanoid");
        System.out.println(dict.get("word"));

        // keySet and iterator
        System.out.println(dict.keySet());

        Iterator<String> it = dict.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
            System.out.println(dict.get(key));
        }

        // constructs iterator under the hood
        for (String key: dict.keySet()) {
            System.out.println(key);
        }

        // this returns null
        System.out.println(dict.get("inexistent"));

    }
}
