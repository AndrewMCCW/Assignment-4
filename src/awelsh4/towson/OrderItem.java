package awelsh4.towson;

public class OrderItem {

	private String desc;
	private double price;
	
	public OrderItem (String name, double price)
	{
		this.desc = name;
		this.price = price;
	}
	
	public String getDesc()
	{
		return this.desc;
	}
	
	public double getPrice()
	{
		return this.price;
	}
}
