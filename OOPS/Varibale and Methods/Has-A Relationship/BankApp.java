class BankApp
{

	public static void main(String [] args)
	{
		Bank bank = new Bank();
		bank.createAccount();
		bank.acc.withdraw(5000);

		System.out.println(bank.ifsc);
		System.out.println(bank.acc.name);

		
	}
}