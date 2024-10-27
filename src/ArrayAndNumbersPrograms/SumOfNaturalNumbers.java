package ArrayAndNumbersPrograms;

public class SumOfNaturalNumbers {

        public static int sumOfNaturalNo(int n){

            n= n*(n+1)/2;
            return n;
        }


    public static void main(String [] args){

        int num=1000;
        System.out.println( sumOfNaturalNo(num));
    }
}
