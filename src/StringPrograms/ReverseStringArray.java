package StringPrograms;

public class ReverseStringArray {

    public static void main(String [] args){
        String [] arr = {"ABC","DEF","GHI","JKL","XYZ"};
        int len = arr.length;
        String [] revArr1 = new String[len];

        for(int i=0;i<=len-1;i++){
             revArr1[i] = arr[len-1-i];
        }
        for(int i=0;i<=len-1;i++){
            System.out.println(revArr1[i]);
        }
    }
}
