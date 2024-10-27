package ArrayAndNumbersPrograms;

public class CheckPrime {

    public static boolean checkPrimeNumber(int num){
        if(num<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if(num % i==0){
                return false;
            }
        }
     return true;

    }

    public static void main(String args[]){
        int n =5;
        if(checkPrimeNumber(n)){
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    }

