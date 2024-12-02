class Employee
{
	int id;
	double salary;
	String name;
  	static String companyName;

	public Employee()
	{ 
		System.out.println("Loaing Done By No-Args Constructor..");
	}

	public Employee(int id, double salary,String name)
	{ 
		System.out.println("Loaing Done By Args Constructor..");
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public void display()
	{ 
		System.out.println("Employee Id:: "+id);
		System.out.println("Employee Salary:: "+salary);
		System.out.println("Employee Name:: "+name);
		System.out.println("Company Name:: "+Employee.companyName); //Directly calling static varible 
		System.out.println("==============================");
	} 
}