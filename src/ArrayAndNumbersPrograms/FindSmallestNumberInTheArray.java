package ArrayAndNumbersPrograms;

public class FindSmallestNumberInTheArray {

    public static void main(String [] args){
        int [] arr = {30,20,10,40,50};
        int len = arr.length;
        int smallest = arr[0];

        for(int i=0;i<len;i++){
            if(arr[i]<smallest){
                smallest = arr[i];


            }
        }
        System.out.println("Smallest Number in the array is:-"+smallest);

    }
}
