//WAJPT read the month number from the user and print how many days are there in that month?
//WAJPT read the month number from the user and print the corresponding month name?

import java.util.Scanner;
class PrintDaysInMonth
{ 
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month");
		int month = sc.nextInt();

		switch(month)
		{  
			case 1: { System.out.println("Entered Month is January:No of Days- 31"); }
				break;
			case 2: { System.out.println("Entered Month is Feburary:No of Days- 28"); }
				break;
			case 3: { System.out.println("Entered Month is March:No of Days- 30"); }
				break;
			case 4: { System.out.println("Entered Month is April:No of Days- 30"); }
				break;
			case 5: { System.out.println("Entered Month is May:No of Days- 31"); }
				break;
			case 6: { System.out.println("Entered Month is June:No of Days- 30"); }
				break;
			case 7: { System.out.println("Entered Month is July:No of Days- 31"); }
				break;
			case 8: { System.out.println("Entered Month is August:No of Days- 31"); }
				break;
			case 9: { System.out.println("Entered Month is September:No of Days- 30"); }
				break;
			case 10: { System.out.println("Entered Month is October:No of Days- 31"); }
				break;
			case 11: { System.out.println("Entered Month is November:No of Days- 30"); }
				break;
			case 12: { System.out.println("Entered Month is December:No of Days- 30"); }
				break;
			default : { System.out.println("Please Enter a Valid Month between 1 to 12");}
		}
	}

}