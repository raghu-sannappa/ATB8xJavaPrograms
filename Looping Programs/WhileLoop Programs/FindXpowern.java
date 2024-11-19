//WAJP to find x^n value.

class FindXpowern
{	

	public static int findXpowernValue(int x,int n)
	{ 
		int prod=1,n1=1;
		while(n1<=n)
		{ 
			prod = prod * x;
		n1++;	
		}
		return prod;
	}
	public static void main(String [] args)
	{ 
		int x=2,n=4;
		int res = findXpowernValue(x,n);
		System.out.println("X^n Result is:"+res);
	}
}