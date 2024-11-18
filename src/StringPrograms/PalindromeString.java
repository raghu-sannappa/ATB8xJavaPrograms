package StringPrograms;

public class PalindromeString {
    public static void main(String [] args){
        String str = "RAGHU";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str)){
            System.out.println("String is palindrome: "+rev);
        }else{
            System.out.println("String is not palindrome:"+rev);
        }

    }
}
