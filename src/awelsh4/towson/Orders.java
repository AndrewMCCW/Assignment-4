package awelsh4.towson;
import java.util.*;

public class Orders {

	private ArrayList<MenuItem> orders;
	
	
	public Orders ()
	{
		orders = new ArrayList<MenuItem>();
	}
	
	public void addOrder(MenuItem item)
	{
		
		orders.add(item);
	}
	
	public String getOrders()
	{
		String s = ""; 
		for (MenuItem item : orders)
		{
			s += " ordered the " + item.getDesc() + " for: " + item.getPrice() + "\n";
		}
		return s;
	}
	
	public double getTotal()
	{
		Double total = 0.0;
		for (MenuItem item : orders)
		{
			total += item.getPrice();
		}
		return total;
	}
}
