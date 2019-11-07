
public class Ball {
	private double price;
	private String name;
	
	public void display()
	{
		System.out.println("price of the ball:"+price);
		System.out.println("name of the ball:"+name);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
