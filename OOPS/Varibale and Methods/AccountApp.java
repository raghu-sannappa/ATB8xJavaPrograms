import java.util.*;

class AccountApp
{
	static Scanner sc = new Scanner(System.in);
	static Account a1 , a2, a3 ;
	public static void main(String [] args)
	{
		
		setPreDifinedData();
		System.out.println("Welcome to Raghu Bank and Finances Services");
		homePage();
		System.out.println("Thank for visiting Raghu Bank and Finances Services");
			
	}	
	public static void homePage()
	{
		boolean exit = false;
		while(!exit)
		{
			System.out.println("\nSELECT AN OPTION BELOW:");
			System.out.println("1.LOGIN");
			System.out.println("2.REGISTER");
			System.out.println("3.Exit");
			System.out.print("Your choice: ");

			int mainChoice = sc.nextInt();
			sc.nextLine(); // Clear the newline character
			switch(mainChoice)
			{ 
				case 1: login() ;break;					
				case 2: register() ;break;
			 	case 3: // Exit                  
					exit = true; // Set the flag to exit the main loop
                   		 	break;
				default: System.out.println("Invalid choice! Please try again.");
			}
	    }	
	}

	public static void login()
	{
		// Login process
                   				 	System.out.println("\n---------HI USER, WELCOME TO " + Account.bankName + "---------");
                   				 	System.out.print("ENTER THE ACCOUNT NUMBER FOR LOGIN: ");
                   				 	long accNumber = sc.nextLong();

                   				 	System.out.print("ENTER THE PIN NUMBER FOR LOGIN: ");
                   				 	int pinNumber = sc.nextInt();

                  
						// Validate user
                  				Account activeAccount = null;

                  			        if (a1.authorizeUser(accNumber, pinNumber)) 
						{
                        				activeAccount = a1;
                 			        } 
						else if (a2.authorizeUser(accNumber, pinNumber)) 
						{
                      				        activeAccount = a2;
                   			        } 
						else if (a3.authorizeUser(accNumber, pinNumber)) 
						{
                      				         activeAccount = a3;
                    				} 
						else 
						{
                        				System.out.println("Invalid account number or pin. Try again.");
                   			        }

                  
				 // User-specific menu
                   		boolean logout = false;
			
                   		 while (!logout)
				 {
                   		    		 System.out.println("\n----- ACCOUNT MENU -----");
                       				 System.out.println("1. PROFILE DETAILS");
                       				 System.out.println("2. ACCOUNT DETAILS");
                      				 System.out.println("3. BALANCE");
                       	 			 System.out.println("4. LOGOUT");
                        			 System.out.print("Your choice: ");
		
                        			 int accountChoice = sc.nextInt();

                        			 switch (accountChoice) 
						{
                            			 	case 1:
                               			   	 	System.out.println("\nYOUR PROFILE DETAILS:");
                                		   		 activeAccount.getProfileDetails();
                                		  		 break;

                           				 case 2:
                                				System.out.println("\nYOUR ACCOUNT DETAILS:");
                                				activeAccount.getAccountDetails();
                                				break;

                           			 	case 3:
                                				System.out.println("\nYOUR CURRENT BALANCE: " + activeAccount.balance + " Rs");
                                				break;

                            				case 4:
                                				System.out.println("Logging out...");
                                				logout = true; // Exit the account menu
                                				break;

                            				default:
                                				System.out.println("Invalid choice. Please try again.");
                        			}
                   		 }
	}
	public static void register()
	{
		System.out.println("\nENTER THE DETAILS FOR NEW USER REGISTRATION.");

				
				
			
				System.out.println("ENTER YOUR NAME");
				String name = sc.nextLine();

				System.out.println("ENTER YOUR PANNUMBER");
				String panNo = sc.nextLine();

				System.out.println("ENTER YOUR PHONE NUMBER");
				long phNo = sc.nextInt();

				System.out.println("ENTER YOUR ADAR NUMBER");
				long adarNo = sc.nextInt();

				NewUserReg newUser = new NewUserReg(name,panNo,phNo,adarNo);
				// Welcome Message for customer..
				System.out.println("--------- USER REGISTERED SUCCESSFULLY TO " +Account.bankName+"------------------");
				newUser.newUserInfo();
	}
	public static void setPreDifinedData()
	{
		
		Account.bankName = "KOTAK MAHINDRA BANK";
		Account.ifscCode = "KKBK00430";
		Account.branch = "Jayanagr";

		 a1 = new Account(101,3043,"RAGHU SANNAPPA",15000,990033113);
		 a2 = new Account(102,5558,"MANJU SANNAPPA",25000,967345123);
		 a3 = new Account(103,9535,"RADHIKA RAGHU",50000,805073152);

	}
	
}