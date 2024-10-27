package ArrayAndNumbersPrograms;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void CheckFactorialOfANumber(int num){
        int fact =1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of a given number is:-"+fact);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for factorial of number:-");
        int num = sc.nextInt();
        CheckFactorialOfANumber(num);
    }
}
