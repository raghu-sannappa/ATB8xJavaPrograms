package ex_21092024;

import java.util.HashSet;

public class DistincitSet {

    public static int getDistincitCount(int [] nums){
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        return set.size();

    }
    public static void main(String [] args){

        int [] arr = {2,3,2,2,3,2,4,5,6,6,5,4,7};
        System.out.println(getDistincitCount(arr));
    }


}
