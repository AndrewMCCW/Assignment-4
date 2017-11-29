package awelsh4.towson;

public class Aggregator {
	private Menu menu;
	private Orders orders;
	
	public Aggregator (Menu menu, Orders orders)
	{
		this.menu = menu;
		this.orders = orders;
	}
	
	public Menu getMenu()
	{
		return this.menu;
	}
	
	public Orders getOrders()
	{
		return this.orders;
	}
}
