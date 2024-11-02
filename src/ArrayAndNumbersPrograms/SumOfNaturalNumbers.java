package ArrayAndNumbersPrograms;

public class SumOfNaturalNumbers {

        public static int sumOfNaturalNo(int num){

            num= num*(num+1)/2;
            return num;
        }


    public static void main(String [] args){

        int num=10;
        System.out.println( sumOfNaturalNo(num));
    }
}
