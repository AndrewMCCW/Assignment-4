package awelsh4.towson;

public class Invoker {
	private final Aggregator agg;
	private Person person;
	
	public Invoker(Aggregator agg)
	{
		this.agg = agg;
	}
	
	public void submitOrder()
	{
		new CMDSubmitOrder(person).execute();
	}
	
	public void displayMenu()
	{
		new CMDDspMenu().execute(); 
	}
	
	public void displayTab(Tab tab)
	{
		new CMDDispTab(tab).execute();
	}
}
