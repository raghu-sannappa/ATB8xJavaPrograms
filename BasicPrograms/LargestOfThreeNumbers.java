class LargestOfThreeNumbers
{ 
	
	public static int findLargestOfThreeNumbers(int a,int b,int c)
	{ 
		if(a>b && a>c)
		{ 
			return a;
		}
		else if(b>a && b>c)
		{ 
			return b;		
		}
		else
		{ 
			return c;
		}
	}
	public static void main(String [] args)
	{
		int a=10,b=20,c=30;
		int res= findLargestOfThreeNumbers(a,b,c);
		System.out.println("Largest of :" +a+ " "+"&" +" " +b+ " "+"&" +" "+c+ " "+"is-" +res);
	}
}