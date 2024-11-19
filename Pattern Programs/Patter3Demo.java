/*WAJP to Print Pattern
1 2 3 4
1 2 3 4 
1 2 3 4 
1 2 3 4 
*/

class Patter3Demo
{ 
	public static void main(String [] args)
	{ 
		int rows=4,value=1;
		for(int i=0;i<rows;i++)
		{ 
			for(int j=0;j<rows;j++)
			{ 
				System.out.print(value);
				value++;
			}
			value=1;
			System.out.println();
		}
	}
}