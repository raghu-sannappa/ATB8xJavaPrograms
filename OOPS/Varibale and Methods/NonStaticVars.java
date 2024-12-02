class NonStaticVars
{
	static int id = 101;
		int age = 32;
		String name = "Raghu";
	public static void main(String [] args)
	{
		System.out.println("Main Begin");
		System.out.println("Static Varibale id:"+NonStaticVars.id); // 101
		
		NonStaticVars nsv = new NonStaticVars();
		nsv.age = 34;
		System.out.println("NonStatic Varibale Age:"+nsv.age); //34
		System.out.println("NonStatic Varibale Name:"+nsv.name); //Raghu
		System.out.println("Static Varibale accessed through object :"+nsv.id);

		System.out.println("Main End");
		
	}
		
	//Non Static block	
	{
		System.out.println("NonStatic Varibale accessed through NonStaticblock- Age:" +age);	
		System.out.println("Static Varibale accessed through NonStaticblock- id:" +id);
	}

}