/*WAJP to Print Pattern

  * * * *
    *   *
     *  *
      * *
        *

*/

class Pattern18Demo
{ 
	public static void main(String [] args)
	{ 
		int n=6;
		
		for(int i=0;i<n;i++)
		{ 
			for(int j=0;j<n;j++)
			{ 
				if(i==0 || j==n-1|| i==j)
				{ 
					System.out.print("* ");
				}
				else
				{
					System.out.print("  "); 
				}
			}
			System.out.println();
		}
	}
}