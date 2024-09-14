package ex_10092024;

public class ReverseStringArray {

    public static String [] reverseStringArray(String [] a){

        int len = a.length;
        String [] revArray = new String[len];

        for(int i=0;i<=len-1;i++){

            revArray[i] = a[len-1-i];
        }
        return revArray;
    }


    public static void main(String [] args){

        String [] names = {"Raghu","Sannappa","Radhika","Manju"};
      String [] revNames =  reverseStringArray(names);

      for(String revNames1:revNames)
        System.out.println(revNames1);

    }
}
