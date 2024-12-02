class StudentApp
{
	public static void main(String [] args)
	{
		Student s1 = new Student(101,"Manju");
		
		//s1.setRollNo(110);
		System.out.println(s1.getRollNo());

		//s1.setStudentName("Raghu");
		System.out.println(s1.getStudentName());

		s1.display();
	}

}