package assignment1;

public class Product 
{
	private int pid,quantity;
	private float price;
	
	public Product(int pid, float price, int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public String toString()
	{
		return "["+pid+" "+price+" "+quantity+"]" ;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
