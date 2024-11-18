package ArrayAndNumbersPrograms;

public class ReverseEachString {

    public static String [] ReverseString(String [] arr){
        int len = arr.length;
        String [] revArray1 = new String[len];

        for(int i=0;i< len;i++){
            revArray1 [i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return revArray1;
    }
    public static void main(String [] args){
        String [] arr = {"ABC","DEF","XYZ"};
        String [] revArray = ReverseString(arr);

        for(String var : revArray){
            System.out.println(var);
        }
    }
}
