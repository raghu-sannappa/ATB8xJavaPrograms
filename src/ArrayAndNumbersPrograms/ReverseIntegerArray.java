package ArrayAndNumbersPrograms;

public class ReverseIntegerArray {

    public static int [] reverseArray(int [] arr){
        int len = arr.length;
        int [] revArray2 = new int[len];

        for(int i=0;i<=len-1;i++){

            revArray2[i] = arr[len-1-i];
        }
        return revArray2;
    }


    public static void main(String [] args){

        int [] arr = {10,20,30,40,50};
        int [] revArray1 = reverseArray(arr);

        for(int var : revArray1){
            System.out.println(var);
        }

    }
}
