/* WAJP to Print pattern 
4 3 2 1
  3 2 1
    2 1
      1
*/



class PatternSolidShapeNumber2
{
	public static void main(String [] args)
	{ 
		int n=4;
		
		for(int i=0;i<n;i++)
		{  
			int num= n-i; // Adjust starting number for each row
			for(int j=0;j<n;j++)
			{  	
				
				if(i<=j)
				{  
					System.out.print(num-- +" ");
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