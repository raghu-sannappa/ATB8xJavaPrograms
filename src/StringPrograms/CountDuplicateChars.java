package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        char[] charArray = str.toCharArray();

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        // Count each character in the string
        for (char c : charArray) {
            //if Map table already contains "letter"
            if (charCountMap.containsKey(c)) {
                //increment the "letter" count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                //else add "letter" to MAP
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Duplicate characters in the string is:");
        //Iterate over Map
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            //if any "letter " count is greater than one
            if (entry.getValue() > 1) {
                //getKey prints letter and getValue prints count.
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
