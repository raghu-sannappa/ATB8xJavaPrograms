package StringPrograms;

public class ReverseEachStringInTheArray {

    public static String [] ReverseEachOneString(String [] arr){
        int len = arr.length;
        String [] revArray2 = new String[len];

        for(int i=0;i<=len-1;i++){
            revArray2[i] = new StringBuilder(arr[i]).reverse().toString();

        }
        return revArray2;

    }

    public static void main(String [] args){
        String [] arr = {"ABC","DEF","GHI","JKL","XYZ"};
        String [] revArray1 = ReverseEachOneString(arr);

        for(String var : revArray1){
            System.out.println(var);
        }
    }
}
