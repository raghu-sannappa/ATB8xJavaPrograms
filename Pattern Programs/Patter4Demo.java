/*WAJP to Print Pattern
1 1 1 1
2 2 2 2 
3 3 3 3  
4 4 4 4
*/

class Patter4Demo
{ 
	public static void main(String [] args)
	{ 
		int rows=4,value=1;
		for(int i=0;i<rows;i++)
		{ 
			for(int j=0;j<rows;j++)
			{ 
				System.out.print(value);
			}
			value++;
			System.out.println();
		}
	}
}