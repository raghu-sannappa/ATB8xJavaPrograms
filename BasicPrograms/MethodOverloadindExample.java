//Order of method binding is similar data type or Widening process.

class MethodOverloadindExample
{ 

	public static void print(int a)
	{ 
		System.out.println("int data type method called");
	}
	
		public static void print(long a)
	{ 
		System.out.println("long data type method called");
	}
	
		
	public static void print(double c)
	{ 
		System.out.println("double data type method called");
	}
	
	public static void print(char ch)
	{ 
		System.out.println("char data type method called");
	}

	public static void main(String [] args)
	{ 
		char a = 'A';
		print(a);
		print((double)a);
		print((float)a);	
	}
}