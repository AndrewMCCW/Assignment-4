package awelsh4.towson;

public class Aggregator {
	private Menu menu;
	private Orders orders;
	private People people;
	private Tabs tabs;
	private Observer observer;
	
	public Aggregator ()
	{
		menu = new Menu();
		people = People.getInstance();
		tabs = Tabs.getInstance();
		Observer.getInstance().subjects();
		observer = Observer.getInstance();
	}
	
	public Menu getMenu()
	{
		return this.menu;
	}
	
	public Orders getOrders()
	{
		return this.orders;
	}
	
	public People getPeople()
	{
		return this.people;
	}
	
	public Tabs getTabs()
	{
		return this.tabs; 
	}
	
	public Observer getObserver()
	{
		return this.observer;
	}
}
