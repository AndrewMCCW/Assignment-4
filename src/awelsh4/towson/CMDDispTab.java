package awelsh4.towson;

public class CMDDispTab implements CMD {
	private Aggregator agg;
	private People people;
	private Person person;
	private Tabs tabs;
	private Tab tab;
	private String name;
	private boolean choice;
	
	public CMDDispTab (Aggregator agg, String name, boolean choice)
	{
		this.agg = agg;
		this.name = name;
		this.people = agg.getPeople();
		this.choice = choice;
		this.tabs = agg.getTabs();
	}
	
	@Override
	public void execute()
	{
		if (choice == true)
		{
			person = people.findPerson(name);
			System.out.println(person.getName() + " " + person.getOrders());
			System.out.println("Your total is: " + person.getTotal());
		}
		
		if (choice == false)
		{
			tab = tabs.findTab(name);
			System.out.println(tab.getTab());
		}
		
	}
}
