class Account
{
	static String bankName;
	static String ifscCode;
	static String branch;
	private long accNo;
	String customerName;
	int pin; 
	double balance;
	long ph;


	
	public Account(long accNo,int pin,String customerName,double balance,long ph)
	{
		//System.out.println("Loading Done By Args Costructor");
		this.accNo = accNo;
		this.customerName = customerName;
		this.balance = balance;
		this.pin = pin;
		this.ph = ph;
	}

	//We use this method to only read account no
	public long getAccNo()
	{
		return accNo;
	}

	//We use this method to modify accno - 
	public void setAccNo(long accNo)
	{
		this.accNo = accNo;
	}

	public boolean authorizeUser(long accNo,int pin)
	{ 
		
		if((accNo==this.accNo)&&(pin==this.pin))
		{ 
			return true;
		}

		else
		{ 
			return false;
		}
	}
	
	public void withdraw(int amt)
	{
		if(amt>balance)
		{

			System.out.println("YOUR ACCOUNT DOES NOT HAVE SUFFICIENT BALANCE TO WITHDRAW...!!");
			System.out.println("BALANCE IS: "+balance+" Rs.");
			
		}
		else 
		{
			balance -= amt;
			System.out.println(amt + " Rs. DEBITED FROM YOUR ACCOUNT");
			System.out.println("CURRENT BALANCE IS: "+balance+" Rs.");
		}
	}

	public void deposit(int amt)
	{
		balance += amt;
		System.out.println(amt + " Rs. CREDITED TO YOUR ACCOUNT");
		System.out.println("CURRENT BALANCE IS: "+balance +" Rs.");

	}

	public void getProfileDetails()
	{ 
		
		System.out.println("NAME :"         +customerName);
		System.out.println("PHONE NUMBER :" +ph);	
	}

	public void getAccountDetails()
	{ 
		System.out.println("ACCOUNT NUMBER :"+accNo);
		System.out.println("NAME :"+customerName);
		System.out.println("IFSC CODE :"+Account.ifscCode);
		System.out.println("BRANCH :"+Account.branch);	
	}

	public void displayInfo()
	{ 
		System.out.println("ACCOUNT NUMBER :"+accNo);
		System.out.println("NAME :"+customerName);
		System.out.println("BALANCE :"+balance+" Rs.");

		//System.out.println("Bank Name :"+Account.bankName);
		//System.out.println("Bank Ifsc Code :"+Account.ifscCode);
		//System.out.println("Bank Branch :"+Account.branch);

		System.out.println("----------------------------------------");
		
		

		

	}

}