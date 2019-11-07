
public class Laptop
{
private double price;
private String brand;

public void setprice(double price)
{
	this.price=price;
}
public double getprice()
{
	return this.price;
}
public String getbrand()
{
	return this.brand;
}
public void setbrand(String brand)
{
	this.brand=brand;
}


public void display() {
System.out.println("the brand is:"+brand);
System.out.println("the price is:"+price);
}

}