class EmployeeApp
{
	public static void main(String[] args)
	{ 
		
		Employee.companyName = "Infosis"; //Initializing static variable.

		//Creating a Object 
		Employee e1 = new Employee();
		e1.display(); // id = 0,salary = 0.0,name = null

		//Initializing Object.
		e1.id = 101;
		e1.salary = 15000;
		e1.name = "Raghu";
		
		e1.display(); // id = 101,salary = 15000.0,name = Raghu,
		

		
		//Creating and initializing using constructor
		Employee e2 = new Employee(102,25000,"Manju");

		e2.display(); // id = 102,salary = 25000,name = Manju

	}
}