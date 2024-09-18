package ex_18092024;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);

            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Frequency of Each Characters are:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            } else {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
