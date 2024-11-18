package ex_13092024;

public class FindSmallestNumberOptimised {

        public static int findSmallest(int [] arr){
            int smallest = arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<smallest){
                    smallest = arr[i];

                }
            }
            return smallest;
           // System.out.println("Smallest Element in the Array is:"+smallest);
        }

    public static void main(String [] args){

        int [] arr = {1,5,4,6,8,2};
        int result = findSmallest(arr);
        System.out.println("Inside Main function smallest :"+ result);
    }
}
