/*WAJP to print pattern 
	1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4

*/

class PatternSolidShapeNumber5
{
	public static void main(String [] args)
	{ 
		int n=5;
		for(int i=0;i<n;i++)
		{ 
			 int num = i + 1; // Set `num` to the current row number	
			for(int j=0;j<n-1;j++)
			{ 
				if(i+j>=n-1)
				{ 
					System.out.print(num-- +" ");   // Print and decrement `num`
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			
		//2nd shape
			int num1=1;
			for(int j=0;j<n;j++)
			{ 
				
				if(i>=j)
				{ 
					System.out.print(num1++ +" ");
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