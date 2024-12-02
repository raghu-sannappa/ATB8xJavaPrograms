class Bank
{
	String name;
	String ifsc;
	String branch;
	Account acc;

	public void createAccount()
	{
		acc = new Account();
		System.out.println("Account Created.");
	}
	
}