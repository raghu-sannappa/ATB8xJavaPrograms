/*WAJP to print pattern 
    A 
    B
A B C D E
    D
    E

*/

class PatternSolidShapeNumber13
{
	public static void main(String [] args)
	{ 
		int n=5;
		char ch='A';
		
		for(int i=0;i<n;i++)
		{ 
			for(int j=0;j<n;j++)
			{
				if (i == n / 2) 
				{ 
                    			// Middle row: A B C D E
                   			 System.out.print((char) ('A' + j) + " ");
               		        } 
				else if (j == n / 2) 
				{ 
                   			 // Middle column: A, B, D, E
                   			 System.out.print(ch + " ");
                		} 
				else 
				{
                   			 // Spaces for alignment
                    			System.out.print("  ");
               		        }
                	}

           		 // Increment character for the middle column
          		  if (i != n / 2) 
			  {
               		  	ch++;
           		  }

            		System.out.println();
		}


		
	}
}