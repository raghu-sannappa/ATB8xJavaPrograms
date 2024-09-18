package ex_18092024;

public class ReverseString {
    public static void main(String [] args){
        String str = "RAGHU";
        String rev ="";
        int len = str.length();

        for(int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String is:"+rev);
    }
}
