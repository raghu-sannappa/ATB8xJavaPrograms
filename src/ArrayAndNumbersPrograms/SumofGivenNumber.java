package ArrayAndNumbersPrograms;



public class SumofGivenNumber {

    public static int SumOfNum(int num){
        int sum=0,rem;
        while (num!=0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        return sum;
    }
    public static void main(String[] args){
        int num =12345;
        int res = SumOfNum(num);
        System.out.println("Sum of given number is:"+res);
        int res2 = SumOfNum(res);
        System.out.println("Sum of result number is:-"+res2);
    }
}
