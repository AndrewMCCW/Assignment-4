package awelsh4.towson;
import java.util.*;

public class Person {
	private ArrayList<OrderItem> orders;
	private double total;
	
	public Person (int table)
	{
		orders = new ArrayList<OrderItem>();
		this.total = 0.0;
	}
	
	public void addOrder(OrderItem item)
	{
		orders.add(item);
	}
	
	public double getTotal()
	{
		for (OrderItem item : orders)
		{
			total += item.getPrice();
		}
		return total;
	}
	
	
}
