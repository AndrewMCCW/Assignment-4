package awelsh4.towson;

public class Invoker {
	private Aggregator agg;
	
	public Invoker()
	{
		this.agg = new Aggregator();
	}
	
	public void submitOrder(String name, String order)
	{
		new CMDSubmitOrder(agg, name, order).execute();
	}
	
	public void displayMenu()
	{
		new CMDDspMenu(agg).execute(); 
	}
	
	public void displayTab(String name, boolean choice)
	{
		new CMDDispTab(agg, name, choice).execute();
	}
	
	public void addPerson(String name)
	{
		new CMDAddPerson(agg, name).execute();
	}
	
	public void connectTab (String person_name, String tab_name)
	{
		new CMDConnectTab (agg, person_name, tab_name).execute();
	}
	
	public void connectTab (String person_name)
	{
		new CMDConnectTab (agg, person_name, person_name).execute();
	}
	
	public void addTab(String name)
	{
		new CMDAddTab(agg, name).execute();
	}
	
	public void dispPeople()
	{
		new CMDDispPeople(agg).execute();
	}
	
	public void dispTabs() //*works*

	{
		new CMDDispTabs(agg).execute();
	}
	
	public void showIngredients()
	{
		new CMDShowIngredients(agg).execute();
	}
	
}
