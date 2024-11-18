package ex_21092024;

import java.util.HashMap;
public class FirstUniqueChar {
    /*Find the first non-repeating character in it and return its index.
     If it does not exist, return -1*/
    static int firstUniqueCharacter(String str) {
        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Loop through the string and count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Loop through the string again and find the first character with a count of 1
        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) == 1) {
                return i;  // Return the index of the first unique character
            }
        }

        // If no unique character is found, return -1
        return -1;

    }

    public static void main(String [] args) {

        assert (firstUniqueCharacter("leetcode") == 0) : "Expect 0 for str = leetcode";
        System.out.println("All test cases in main function passed");
        assert (firstUniqueCharacter("loveleetcode") == 2) : "Expect 2 for str = loveleetcode";
        assert (firstUniqueCharacter("aabb") == -1) : "Expect -1 for str = aabb";
    }
}
