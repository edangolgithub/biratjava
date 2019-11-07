
public class Car extends Vehicle
{
	public Engine carengine;
	public Car()
	{
		setModel("no model");
		setCountry("no country");
		setPrice(0);
		setWheels(4);
	}
public Car(String model, String country, double price)
    {
	setModel(model);
	setCountry(country);
	setPrice(price);
	setWheels(4);
		
	}


}
