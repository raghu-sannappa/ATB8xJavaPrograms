package ex_06092024;

public class ReverseNumber {

    public static void reverse(){
        int num = 789;
        int reversedNum=0;
        int remainder;
        while (num!=0){
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num/=10;
        }
        System.out.println("Reversed Number is :-"+reversedNum);
    }
    public static void main(String [] args){
        reverse();
    }
}
