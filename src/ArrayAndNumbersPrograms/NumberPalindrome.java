package ArrayAndNumbersPrograms;

import java.util.Scanner;

public class NumberPalindrome {
    public static void CheckPalindromeNumber(int num){
        int originalNum = num;
        int revNum = 0,rem =0;
        while(num!=0){
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num/=10;
        }
        System.out.println("Reversed number is :-"+revNum);
        if(revNum==originalNum){
            System.out.println("Entered Number is Palindrome:-"+revNum);
        }else {
            System.out.println("Entered Number is not palindrome:-"+revNum);
        }

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome number:-");
        int num = sc.nextInt();
        CheckPalindromeNumber(num);

    }
}
