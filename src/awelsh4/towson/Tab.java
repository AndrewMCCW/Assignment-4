package awelsh4.towson;
import java.util.*;

public class Tab {
	private ArrayList<Person> persons = new ArrayList<Person>();
	private String currentTab = "";
	private double entireTab = 0.0;
	private String name;
	
	public Tab(String name)
	{
		this.name = name;
	}
	
	public void addPerson(Person person)
	{
		persons.add(person);
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public String getTab()
	{
		for (Person person : persons)
		{
			currentTab += person.getName() + "'s total is " + person.getTotal() + "\n";
			entireTab = entireTab + person.getTotal();
		}
		currentTab += "Entire table's tab is: " + entireTab;
		return currentTab;
	}
	
	public String getReceipt(String name)
	{
		for (Person person : persons)
		{
			if (person.getName().toLowerCase().equals(name.toLowerCase()))
			{
				return person.getOrders();
			}
		}
		return "We cannot find your receipt";
	}
}
