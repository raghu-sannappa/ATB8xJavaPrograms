// WAJPT read the person name and his age and print is he eligible to vote or not?

import java.util.Scanner;
class VotingEligibility
{ 
	
	public static boolean chekVotingEligibility(String nationality,int age)
	{ 
		if((nationality.equalsIgnoreCase("Indian")) && (age>=18))
		{ 
			return true;
		}
		else
		{ 
			return false;
		}
	} 
	public static void main(String [] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the Nationality:");
		String nationality = sc.nextLine();


		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		
		
		if(chekVotingEligibility(nationality,age))
		{ 
			System.out.println(name+": is eligible to vote.");
		}
		else 
		{ 
			System.out.println(name+": is not eligible to vote.");
		}
	}
}