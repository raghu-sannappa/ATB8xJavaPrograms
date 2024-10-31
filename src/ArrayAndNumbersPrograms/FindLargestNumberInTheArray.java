package ArrayAndNumbersPrograms;

public class FindLargestNumberInTheArray {

    public static void main(String [] args){
        int [] arr = {40,50,10,20,30};
        int len = arr.length;
        int largest = arr[0];

        for(int i=0;i<=len;i++){
            if(arr[i]>largest){
                largest= arr[i];
                System.out.println("Largest Number in the array is:-"+largest);
                break;
            }
        }
    }
}
