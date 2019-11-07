

public class Vehicle 
{

	private String Model;
	private String Country;
	private double Price;
	private int wheels;
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public Vehicle(String model, String country, double price, int wheels) {
		
		Model = model;
		Country = country;
		Price = price;
		this.wheels = wheels;
	}
	public Vehicle() {
		this.Model="no model";
		this.Price=0;
		this.Country="no country";
		this.wheels=0;
	}

	public void display()
	{
		System.out.println("the model is : "+Model);
		System.out.println("the price is : "+Price);
		System.out.println("the country is : "+Country);
		System.out.println("the wheels is : "+wheels);
	}

}
