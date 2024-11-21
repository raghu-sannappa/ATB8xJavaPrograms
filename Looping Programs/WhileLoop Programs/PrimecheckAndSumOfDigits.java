//WAJP to print numbers from 100 to 500 which are - Number must be prime number & Sum of digits of number must be <=6.
//Logic for prime number example 1,2,3,4,5 - 5 is prime because it is divisible by 1 and 5(count-2), 4 is not because it is divisible by 1,2,4(count-3)

class PrimecheckAndSumOfDigits {
    
    public static int sumOfDigits(int num)
    {
            int sum=0;
            while(num!=0)
            {
            
            int last = num % 10;
            sum = sum + last;
            num = num/10;
            }
            return sum;
            
    }
    public static boolean isPrime(int num)
    { 
       int count=0,first=1;
		while(first<=num)
		{ 
			if(num%first==0)
			{  
				count++;	
			}
		first++;
		}
		//if count<=2 or ==2 then we can say it as prime number.
		return count==2;
    }

    public static void main(String[] args) {
       
       int num=100;

	System.out.println("Prime Numbers between 100 to 500 and their sum of digits<=6");
       while(num<=500)
       {
           if(isPrime(num) && sumOfDigits(num)<=6)
           {
               System.out.println(num);
           }
           num++;
       }
       if(isPrime(num))
       {
            System.out.println(num+":is a prime number");
        }
        else
        {
            System.out.println(num+":is not a prime number");
        }
       
    }
}