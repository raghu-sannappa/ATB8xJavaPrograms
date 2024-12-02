class CarShowRoom
{
	String brand,colour,variant;
	double price;
	String [] cars;

	
	
	public CarShowRoom(String brand,String colour,String variant,double price)
	{
		this.brand=brand;
		this.colour = colour;
		this.variant = variant;
		this.price=price;
	}

	public CarShowRoom(String [] cars)
	{
		this.cars=cars;
		
	}



	public void displayInfo()
	{
		System.out.println("BRAND   - "+brand);
		System.out.println("COLOUR  - "+colour);
		System.out.println("VARIANT - "+variant);
		System.out.println("PRICE   - "+price+ " Rs");

		
	}
	
	public void displayCarsAvailable(String [] cars)
	{
	
		System.out.println("CARS AVAILABLE IN THE SHOWROOM ARE:");
		System.out.println();
		
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(i+1 +"."+cars[i]);
		}		
	}

	
}