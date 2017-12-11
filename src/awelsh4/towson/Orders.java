package awelsh4.towson;
import java.util.*;

public class Orders {

	private ArrayList<OrderItem> orders;
	
	
	public Orders ()
	{
		orders = new ArrayList<OrderItem>();
	}
	
	public void addOrder(String desc)
	{
		
		orders.add(order_item);
	}
	
	public String getOrders()
	{
		String s = null; 
		for (OrderItem order : orders)
		{
			s += " ordered the " + order.getDesc() + " for: " + order.getPrice() + " /n";
		}
		return s;
	}
	
	public double getTotal()
	{
		Double total = 0.0;
		for (OrderItem order : orders)
		{
			total += order.getPrice();
		}
		return total;
	}
}
