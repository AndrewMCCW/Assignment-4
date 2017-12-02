package awelsh4.towson;
import java.util.*;

public class Invoker {
	private ArrayList<CMD> commandList;
	private final Aggregator agg;
	
	public Invoker(Aggregator agg)
	{
		this.agg = agg;
		commandList = new ArrayList<CMD>();
	}
	
	public void displayTab()
	{
		commandList.add(new CMDSubmitOrder());
	}
	
	public void displayMenu()
	{
		commandList.add(new CMDDspMenu()); 
	}
	
	public void submitOrder(Tab tab)
	{
		commandList.add(new CMDDispTab(tab));
	}
}
