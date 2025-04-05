package assignment3;

public class Product implements Taxable
{
	private int pid;
	private float price;
	private int quantity;
	
	public Product(int pid, float price, int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	@Override
	public void calTax()
	{
		System.out.println("The Sales Tax on unit Price is "+price*salesTax);
	}

}
