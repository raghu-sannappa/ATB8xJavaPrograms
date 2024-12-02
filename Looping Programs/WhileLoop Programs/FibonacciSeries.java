class FibonacciSeries
{
	public static void main(String [] args)
	{ 
		
		int n =10;
		int first =0,second=1;

		for(int i=0;i<n;i++)
		{
			System.out.print(first+" ");   // Print the current term
			int next = first + second;      // Calculate the next term
			first=second;                   // Update the first term
			second = next;                  // Update the second term
		}
	}
}