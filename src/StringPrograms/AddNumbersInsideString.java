package StringPrograms;

public class AddNumbersInsideString {


    public static int AddNumber(String str){
        int len = str.length();
        String temp="";

        int sum =0;
        for(int i=0;i<=len-1;i++){
            char  ch = str.charAt(i);
            // Check if the current character is a digit
            if(Character.isDigit(ch)){
                temp = temp+ch;
            }else {
                // Convert temp to integer and add to sum if temp is not empty
                if (!temp.isEmpty()) {
                    sum = sum + Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        // If there is a number left at the end, add it to the sum
       if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }

        return sum;

    }
    public static void main(String [] args){
        String str = "abc100def200a1";
        int res = AddNumber(str);
        System.out.println("Sum of numbers inside string is:"+res);
    }
}
