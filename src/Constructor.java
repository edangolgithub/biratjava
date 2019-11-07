
public class Constructor 
{
    // it is a method
	// it has same name as class name
	// it doesnot has return type
	// it can have parameters
	// it can be over loaded
	// this method is executed when an instance of class is created
	// constructor is used to initialize the data members of the class.
	
	public Constructor() // default
	{
		x=10;
	}
	public Constructor(int x) // parameterized
	{
		this.x=x;
		
	}
	
	public int x;
	public static int y;
	
	
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
