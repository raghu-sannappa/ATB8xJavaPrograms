// WAJPT read the 4 subject marks of a student and print the result pass or fail?

import java.util.Scanner;
class StudentPassOrFail
{ 
	public static void main(String [] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in Subject1:");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter the marks in Subject2:");
		int sub2 = sc.nextInt();

		System.out.println("Enter the marks in Subject3:");
		int sub3 = sc.nextInt();

		System.out.println("Enter the marks in Subject4:");
		int sub4 = sc.nextInt();

		if((sub1+sub2+sub3+sub4)/4 >= 35)
		{ 
			System.out.println("Student is Passed");
		}
		else
		{  
			System.out.println("Student is Failed.");
		}
	}
}