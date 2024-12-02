class StaticVars
{
	static int id = 101;

	public static void main(String [] args)
	{ 
		int age = 32;
		System.out.println("Main Begin");
		System.out.println("Static Variable id :"+StaticVars.id); // 101
		System.out.println("Local Variable age :"+age);// 32
		System.out.println("Main End");
		
		
	}

}