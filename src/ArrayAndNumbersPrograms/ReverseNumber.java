package ArrayAndNumbersPrograms;

public class ReverseNumber {
    public static void main(String [] args){
        int num =12345;
        int revNum = 0,rem=0;
        while(num!=0){
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num/=10;
        }
        System.out.println("Reversed Number is :-"+revNum);
    }
}
