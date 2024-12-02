class Student 
{

	private int rollNo;
	private String studentName;
	//private String deptName;
	//private String semester;
	

	public Student(int rollNo,String studentName)
	{
		this.rollNo = rollNo;
		this.studentName = studentName;
	}

	public int getRollNo()
	{
		return rollNo;
	}
	
	/*public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo ;
	}*/
	
	public String getStudentName()
	{
		return studentName;
	}
	
	/*public void setStudentName(String studentName)
	{
		this.studentName = studentName ;
	}*/

	public void display()
	{
		System.out.println("Roll Number :"+rollNo);
		System.out.println("Student name :"+studentName);

	}

}