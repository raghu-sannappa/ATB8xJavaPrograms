package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class RemoveDigits {
    public static void main(String[] args) {
        String str = "au2ToM3atI5oN";
        StringBuilder result = new StringBuilder();
        String temp="";
        char ch;

        // Filter out digits and build the new string with letters only
     /*   for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }

        // Display the result without digits
        System.out.println(result.toString());*/

        //2nd Way

        for(int i=0;i<=str.length()-1;i++){
            ch = str.charAt(i);
            if(Character.isLetter(ch)){
                temp = temp+ch;
            }
        }
        System.out.println("Only letters after removing digits:-"+temp);

    }
}
