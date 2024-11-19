/*WAJP to Print Pattern
4 4 4 4
3 3 3 3
2 2 2 2 
1 1 1 1 
*/
class Pattern6Demo
{ 
	public static void main(String [] args)
	{ 
		int rows=4,value=4;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{ 
				System.out.print(value);
			} 
			value--;
			System.out.println();
		}
	}

}