/* WAJP to print pattern 
1
2 3
4 5 6
7 8 9 10
*/


class PyramidNumberPattern
{
	public static void main(String [] args)
	{ 
		int n=4,num=1;
		for(int i=0;i<n;i++)
		{ 
			for(int j=0;j<n;j++)
			{ 
				if(i>=j)
				{
					System.out.print(num++ +" ");
				}
				else
				{
					System.out.print("");
				}
				
			}
			
			
			System.out.println();
		}
		
	}
}