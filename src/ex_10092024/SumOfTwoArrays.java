package ex_10092024;

public class SumOfTwoArrays {

    public static int sumOfTwoArrays(int []a, int[] b){
        int total_sum=0;
        for(int i=0;i<a.length;i++) {
            total_sum = total_sum+a[i];

        }
        for(int i=0;i<b.length;i++) {
            total_sum = total_sum+b[i];

        }

        return total_sum;

    }
    public static void main(String[] args){

        //sumOfTwoArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 });

            int [] arr1  = {20};
            int [] arr2  = {20,20,40};
            int total_Sum = sumOfTwoArrays(arr1,arr2);
        System.out.println("Total sum: " + total_Sum);
     //   System.out.println(sumOfTwoArrays(new int[] { 20 }, new int[] { 20, 20, 40}));
    }
}
