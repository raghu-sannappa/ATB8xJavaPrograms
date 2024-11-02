package ArrayAndNumbersPrograms;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to generate fibonacci sereis:-");
        int num = sc.nextInt();

        int [] arr = new int[num];
        int len = arr.length;
        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<=len-1;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println("Fibonacci series for "+num+" is ");

        for(int i=0;i<=len-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
