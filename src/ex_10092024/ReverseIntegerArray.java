package ex_10092024;

public class ReverseIntegerArray {

    public static int [] reverseArray(int [] a){
        int len = a.length;
        int [] rev_arr = new int[len];

        for(int i=0;i<=len-1;i++){

            rev_arr[i] = a[len-1-i];
        }
        return rev_arr;
    }


    public static void main(String [] args){

        int [] num_arr = {10,20,30,40,50};
        int [] rev1 = reverseArray(num_arr);

        for(int revnames : rev1){
            System.out.println(revnames);
        }

    }
}
