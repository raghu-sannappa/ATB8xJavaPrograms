/*WAJP to print pattern 
4 4 4 4 4 4 4
  3 3 3 3 3
    2 2 2 
      1

*/

class PatternSolidShapeNumber7
{

	public static void main(String [] args)
	{ 
		int n=4,num=4,num1= 4;
		for(int i=0;i<n;i++)
		{  
			
			for(int j=0;j<n-1;j++)
			{ 
				if(i<=j)
				{ 
					System.out.print(num  +" ");
				}
				else
				{ 
					System.out.print("  ");
				}
			
			}
			num--;
			
			

			//2nd shape 
		
			

			for(int j=0;j<n;j++)
			{ 
				if(i+j<=n-1)
				{ 
					System.out.print(num1  +" ");
				}
				else
				{ 
					System.out.print("  ");
				}
			
			}
			num1--;

			
			System.out.println();
		}
	
	}
}