package ex_13092024;

public class FindSecongLargest {
    public static void findSecondLargestNum(int [] arr){
        int temp = 0;
        int len= arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("Second Largest Element in the array is:"+ arr[len-2]);
    }

    public static void main(String [] args){

        int [] arr = {1,2,4,4,3,3,6,9,8};
        findSecondLargestNum(arr);

    }
}
