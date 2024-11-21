/*WAJP to Print Pattern

* * * *
*     *
*     *
* * * *

*/

class Pattern16Demo
{
	public static void main(String [] args)
	{
		int n=4;

		for(int i=0;i<n;i++)
		{ 
			for(int j=0;j<n;j++)
			{ 
				if(i==0 || j==0 || i==n-1 || j==n-1)
				{
					System.out.print("* ");
				}
				else 
				{
                   		 	// Print space for the hollow part
                 		  	 System.out.print("  ");
				}
					
			}
			System.out.println();
		}
	}
}