package ex_13092024;

public class FindGivenElement {
        public static int findElement(int N,int[] arr1,int x){
            for(int i=0;i< N;i++){

                if(arr1[i]==x){
                    return i;
                }

            }
            return -1;

        }

    public static void main(String [] args){

        int [] arr = {1,3,4,2,1};
        int x=1,N=5;
       int result =  findElement(5,arr,1);
        if (result != -1) {
            System.out.println("The leftmost occurrence of " + x + " is at index: " + result);
        } else {
            System.out.println(x + " is not present in the array.");
        }
    }
}
