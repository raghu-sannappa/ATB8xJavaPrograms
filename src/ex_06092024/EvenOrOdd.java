package ex_06092024;

public class EvenOrOdd {

    public static void evenoroddcheck(int a){
        if(a%2==0){
            System.out.println("Even Number:"+a);

        }else{

            System.out.println("Odd Number:"+a);

        }
    }
    public static void main(String[] args){
        int num = 11;
        evenoroddcheck(num);

    }
}
