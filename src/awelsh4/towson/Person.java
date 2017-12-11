package awelsh4.towson;
import java.util.*;

public class Person {
	private Orders orders;
	private double total;
	private String name;
	private boolean order_status = false;
	private String o;
	private Table
	
	public Person ()
	{
		orders = new Orders();
		this.total = 0.0;
	}
	
	public void addName(String name)
	{
		this.name = name; 
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addOrder(String desc)
	{
		order_status = true;
		orders.addOrder(desc);
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
	
	
}
