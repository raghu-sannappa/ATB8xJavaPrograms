package ArrayAndNumbersPrograms;

import java.util.Scanner;

public class SearchArray {

    public static void main(String [] args){
        int [] arr = {30,10,20,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search the array:-");
        int num = sc.nextInt();
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                found = true;
                System.out.println(num+":-Found in the array");
                break;
            }
        }
        if(!found){
            System.out.println(num+":- is not in the array");
        }
    }
}
