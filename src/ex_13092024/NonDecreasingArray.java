package ex_13092024;

public class NonDecreasingArray {
    public static boolean checkArray(int [] arr1){

        for(int i=1;i< arr1.length;i++){
            if(arr1[i]<arr1[i-1]){
                return false;
            }

        }
        return true;

        }


    public static void main(String [] args){

        int [] arr = {1,2,3,4,5};
       if( checkArray(arr)){
           System.out.println("The Array is Non Decreasin");
       }else {
           System.out.println("The Array is Decreasin");
       }
    }
}
