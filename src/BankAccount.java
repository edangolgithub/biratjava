
public class BankAccount {
	private double balance;
	public String acno;
	
	public void deposit(double amount)
	{
		if(amount<1)
		{
			System.out.println("Amount must be more than Rs.1");
			return;
		}
		balance+=amount;
		System.out.println("Rs."+amount +" Deposited");//cout<<"Rs."<<amount<<endl;
	}
	public void withdraw(double amount)
	{
		if(balance==0)
		{
			System.out.println("You cannot withdraw money");	
			return;
		}
		balance-=amount;
		System.out.println("Rs."+amount +" Withdrawn");
	}
public void display()
{
	System.out.println("Account no : "+acno+ " has "+" Rs."+balance+" balance");
}
}
