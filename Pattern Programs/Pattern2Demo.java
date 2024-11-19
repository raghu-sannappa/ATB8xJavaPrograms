/*WAJP to Print Pattern
1 2 3 4
5 6 7 8 
9 10 11 12 
13 14 15 16 
*/

class Pattern2Demo
{
	public static void main(String [] args)
	{ 
		int rows=4;
		int value=1;
		for(int i=0;i<rows;i++)
		{ 
			for(int j=0;j<rows;j++)
			{ 
				System.out.print(value+" ");
				value++;
			}
		System.out.println();
		}
	}
}