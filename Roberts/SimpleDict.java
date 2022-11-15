import java.util.ArrayList;

class SimpleDict {
    public static void main(String[] args) {
        SimpleDict myDict = new SimpleDict();
        myDict.put("first", "first_value");
        myDict.put("second", "2 val");
        myDict.put("third", "tres");
        myDict.put("fourth", "quattroch");
        System.out.println(myDict.get("first"));
        System.out.println(myDict.get("second"));
        System.out.println(myDict.get("third"));
    }

    private int MAX = 8;
    private String[][] keys = new String[8][8];
    private String[][] values = new String[8][8];

    private void put(String key, String value) {
        int index = getKeyIndex(key);
        for (int i = 0; i < MAX; i++) {
            if (keys[index][i] == null) {
                keys[index][i] = key;
                values[index][i] = value;
                System.out.println("Index: " + index);
                System.out.println("I: " + i);
                return;
            }
        }
        return;
    }

    private String get(String key) {
        int index = getKeyIndex(key);
        for (int i = 0; i < MAX; i++) {
            if (keys[index][i] == key) {
                return values[index][i];
            }
        }
        return null;
    }

    private int getKeyIndex(String key) {
        int result = getHash(key);
        while (result > 8) {
            result /= 8;
        }
        return result;
    }

    private int getHash(String key) {
        int hash = 7;
        for (int i = 0; i < key.length(); i++) {
            hash = hash * 31 + key.charAt(i);
        }

        return hash;
    }   
}