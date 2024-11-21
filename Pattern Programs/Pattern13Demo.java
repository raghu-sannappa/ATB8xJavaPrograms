/*WAJP to Print Pattern
1 A 1 A
2 B 2 B 
3 C 3 C 
4 D 4 D 
*/

class Pattern13Demo
{
	public static void main(String [] args)
	{  
		int n=4;
		
		for(int i=0;i<n;i++)
		{ 
			int k=i+1;
			char ch=(char)('A'+ i);
			for(int j=0;j<n;j++)
			{  
				if(j % 2==0)
				{
					System.out.print(k +" ");
				}
				else
				{  
					System.out.print(ch +" ");
				}
			}
			
			System.out.println();
		}
	}
}