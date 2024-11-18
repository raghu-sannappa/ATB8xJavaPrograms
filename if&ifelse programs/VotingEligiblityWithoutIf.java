//WAJP to print A person is Eligible to vote based on age and nationality using ternary operator.

class VotingEligiblityWithoutIf
{ 
	public static void main(String [] args)
	{ 
		String name = "Raghu";
		String nationality = "indian";
		int age = 16;

		System.out.println((nationality=="indian" && age>=18 ) ? name +":is Eligible To Vote" : name +":is Not Eligible To Vote");
	}
}