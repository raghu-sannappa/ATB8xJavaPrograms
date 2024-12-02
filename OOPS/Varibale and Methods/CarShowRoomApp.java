import java.util.*;
class CarShowRoomApp
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		String [] cars = {"HYUNDAI i20","MAHINDRA THAR","INNOVA CRYSTA","BENZ","BMW"};

		//CarShowRoom c1 = new CarShowRoom("MAHINDRA THAR","BLACK","DIESEL",2000000);
		//c1.displayInfo();

		CarShowRoom c10 = new CarShowRoom(cars);
		c10.displayCarsAvailable(cars);
		
		System.out.println();
		System.out.println("SELECT WHICH CAR DETAILS YOU WANT..");
		
		int ch = sc.nextInt();
		sc.nextLine(); // Consume the leftover newline character
		switch(ch)
		{ 
			case 1: System.out.println("---------DETAILS OF HYUNDAI i20---------");
				
					CarShowRoom c1 = new CarShowRoom("HYUNDAI i20","RED","DIESEL",1200000);	
					c1.displayInfo();
					break;
			case 2: System.out.println("---------DETAILS OF MAHINDRA THAR ---------");
				
					CarShowRoom c2 = new CarShowRoom("MAHINDRA THAR","BLACK","DIESEL",2000000);	
					c2.displayInfo();
					break;

			case 3: System.out.println("---------DETAILS OF INNOVA CRYSTA ---------");
				
					CarShowRoom c3 = new CarShowRoom("INNOVA CRYSTA","WHITE","HYBRID",3500000);	
					c3.displayInfo();
					break;

			
			case 4: System.out.println("---------DETAILS OF BENZ ---------");
				
					CarShowRoom c4 = new CarShowRoom("BENZ","BLUE","PETROL",4500000);	
					c4.displayInfo();
					break;

			case 5: System.out.println("---------DETAILS OF BMW ---------");
				
					CarShowRoom c5 = new CarShowRoom("BMW","WHITE","PETROL",3700000);	
					c5.displayInfo();
					break;
			default : System.out.println("PLEASE SELECT RIGHT OPTION.");



		}

		System.out.println("DO YOU WANT TO BUY THIS CAR ..(Y/N)");
		System.out.println();
		//char opt = sc.nextLine().charAt(0);
		String input = sc.nextLine();

		if (!input.isEmpty()) 
		{
    			char opt = input.charAt(0);

			switch(opt)
			{
				case 'Y' :
				case 'y' : System.out.println("ARE YOU PAYING VIA CASH OR LOAN");
				  	   String cash = sc.nextLine();
					
					   System.out.println("Payment mode selected: " + cash);
				
					   System.out.println();
					   System.out.println("Thank You For Your Purchase Car Will Be Delivered To Your Home...");
				   	   break;
				case 'N' :
				case 'n' : System.out.println("Thank You For The Visit.....");
				  	   break;

				default:
                  			  System.out.println("Invalid option. Please enter Y or N.");
                  			  break;

			}
    			
		} 
		else 
		{
   		 	System.out.println("No input provided!");
		}
		
		
		

		
	}
}