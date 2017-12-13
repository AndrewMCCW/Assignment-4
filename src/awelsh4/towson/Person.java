package awelsh4.towson;
import java.util.*;

public class Person {
	private Orders orders;
	private double total;
	private String name;
	private boolean order_status = false;
	private String o;
	private Tab tab;
	
	public Person (String name)
	{
		orders = new Orders();
		this.total = 0.0;
		this.name = name;
	}
	
	public void addTab(Tab tab)
	{
		this.tab = tab;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void addOrder(MenuItem item)
	{
		order_status = true;
		orders.addOrder(item);
	}
	
	public double getTotal()
	{
		total = orders.getTotal();
		return total;
	}
	
	public String getOrders()
	{
		o = orders.getOrders();
		return o;
	}
	
	public boolean getOrderStatus()
	{
		return order_status;
	}
	
	public Tab getTab()
	{
		return tab;
	}
}
