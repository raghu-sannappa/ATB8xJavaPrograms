package StringPrograms;

public class ExtractUpperCaseLetters {
    public static void main(String [] args){

        /*String input = "auToMatIoN";
        String result = "";

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                result += ch;
            }
        }

        // Output the result
        System.out.println("Output: " + result);*/

        String str = "auToMatIoN";
        StringBuilder res = new StringBuilder();

        for(int i=0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                res.append(ch);
            }
        }
        System.out.println("UpperCase Letters Are:-"+res);

    }
}
