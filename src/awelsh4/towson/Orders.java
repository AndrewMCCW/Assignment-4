package awelsh4.towson;
import java.util.*;

public class Orders {

	private ArrayList<OrderItem> orders;
	
	public Orders ()
	{
		orders = new ArrayList<OrderItem>();
	}
	
	public void addOrder(OrderItem order_item)
	{
		orders.add(order_item);
	}
}
