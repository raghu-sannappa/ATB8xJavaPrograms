package ArrayAndNumbersPrograms;

import java.util.Scanner;

public class SearchTheIndexOfNum {

    public static void main(String [] args){
        int [] arr = {20,10,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search:-");
        int num = sc.nextInt();
        int index = 0;
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                found = true;
                System.out.println(num+":-Found At Index:-"+index);
                break;

            }
            index++;
        }
        if(!found){
            System.out.println("The number you have entered is not in the array.!!");
        }
    }
}
