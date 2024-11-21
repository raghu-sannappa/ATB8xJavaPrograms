/*WAJP to Print Pattern
4 3 2 1 
4 3 2 1
4 3 2 1 
4 3 2 1 
*/

class Pattern5Demo
{
	public static void main(String [] args)
	{ 
		int rows=4,value=4;
		
		for(int i=0;i<rows;i++)
		{ 
			value=4;
			for(int j=0;j<rows;j++)
			{ 
				System.out.print(value);
				value--;
			}
			
		System.out.println();
		}
	}
}