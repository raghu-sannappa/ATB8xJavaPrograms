//WAJP to swap values of 2 variables.
class SwapTwoNumbers
{ 
	public static void main(String [] args)
	{  
		int a=10,b=20,temp;
		System.out.println("Before Swapping"+a+" "+b);
		temp = a;
		a=b;
		b=temp;
		System.out.println("After Swapping"+a+" "+b);

	}
}