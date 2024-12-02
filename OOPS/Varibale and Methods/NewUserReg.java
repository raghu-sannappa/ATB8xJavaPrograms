class NewUserReg
{
	String name;
	String panNumber;
	long phNumber;
	long adarNumber;

	
	public NewUserReg(String name,String panNumber,long phNumber,long adarNumber)
	{
		//System.out.println("Loading Done By Args Costructor");
		this.name = name;
		this.panNumber = panNumber;
		this.phNumber = phNumber;
		this.adarNumber = adarNumber;
	
	}

	

		
	
	public void newUserInfo()
	{ 
		System.out.println("NAME :"+name);
		System.out.println("PAN NUMBER :"+panNumber);
		System.out.println("PHONE NUMBER :"+phNumber);
		System.out.println("ADAR NUMBER :"+adarNumber);
		


		//System.out.println("Bank Name :"+Account.bankName);
		//System.out.println("Bank Ifsc Code :"+Account.ifscCode);
		//System.out.println("Bank Branch :"+Account.branch);

		System.out.println("----------------------------------------");
		
		

		

	}

}