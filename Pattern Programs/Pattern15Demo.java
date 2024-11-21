/*WAJP to Print Pattern

      *
      *
      *	
* * * *

*/

class Pattern15Demo 
{
    public static void main(String[] args) 
{
        int n = 4; // Size of the pattern
        
        for (int i = 0; i < n; i++) 
	{
            for (int j = 0; j < n; j++) 
	    {
                // Print '*' for the last row or the last column
                if (i == n - 1 || j == n - 1) 
		{
                    System.out.print("* ");
                } 
		else 
		{
                    // Print spaces for the hollow part
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}