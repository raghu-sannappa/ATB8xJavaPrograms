/*WAJP to print pattern 
	4
      3 4 3
    2 3 4 3 2
  1 2 3 4 3 2 1

*/

class PatternSolidShapeNumber6
{

	public static void main(String [] args)
	{ 
		int n=4;
		for(int i=0;i<n;i++)
		{  
			int num= n-i;
			for(int j=0;j<n-1;j++)
			{ 
				if(i+j>=n-1)
				{ 
					System.out.print(num++  +" ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}

			//2nd shape 
		
			int num1= n;

			for(int j=0;j<n;j++)
			{ 
				if(i>=j)
				{ 
					System.out.print(num1--  +" ");
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