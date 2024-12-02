/* WAJP to print pattern 

          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
*/


class PyramidPattern3
{
	public static void main(String [] args)
	{  
		int n=5;

		//i<n-1 because after merging 2 shapes center line star reapts so upper shape repeating character is removed by i<n-1.
		//If you want to see difference remove -1 and check.
		for(int i=0;i<n-1;i++)
		{  
			for(int j=0;j<n;j++)
			{  
				if(i+j>n-1)
				{
				 	System.out.print("* ");
				}
				else 
				{ 
					System.out.print("  ");
				}
			}
			

			for(int j=0;j<n;j++)
			{ 
				if(i>=j)
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

		//2nd Shape
		for(int i=0;i<n;i++)
		{ 
			for(int j=0;j<n;j++)
			{ 
				if(i<j)
				{
					System.out.print("* ");
				}
				else
				{  
					System.out.print("  ");
				}
			}
			
			for(int j=0;j<n;j++)
			{ 
				if(i+j<=n-1)
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