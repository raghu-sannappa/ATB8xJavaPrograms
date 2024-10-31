package ArrayAndNumbersPrograms;

public class FindSecondLargest {

    public static void main(String [] args){
        int [] arr = {20,10,40,30,50};
        int len = arr.length;
        int temp;

        for(int i=0;i<=len;i++){
            for(int j=i+1;j<=len-1;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println("Second Largest Number in the array is:-"+arr[len-2]);
    }
}
