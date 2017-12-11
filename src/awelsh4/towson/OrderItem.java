package awelsh4.towson;

public class OrderItem implements Item{

	private String desc;
	private double price;
	private String type;
	
	public OrderItem (String name, double price)
	{
		this.desc = name;
		this.price = price;
	}
	
	@Override
	public String getDesc()
	{
		return this.desc;
	}
	
	@Override
	public double getPrice()
	{
		return this.price;
	}

	@Override
	public String getType() {
		return this.type;
	}
}
