package ex_13092024;

public class LargestElementInTheArray {

        public static void findLargest(int [] arr){
            int largest = arr[0];
            for(int i=0;i< arr.length;i++){
                if(arr[i]>largest){
                   largest = arr[i] ;
                }
            }
            System.out.println("Largest Element in the Array is :"+largest);
        }

    public static void main(String [] args){

        int [] arr = {2,4,6,3,8};
        findLargest(arr);
    }
}
