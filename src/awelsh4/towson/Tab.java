package awelsh4.towson;
import java.util.*;

public class Tab {
	private ArrayList<Person> persons;
	private String currentTab;
	private int 
	
	public Tab()
	{
		persons = new ArrayList<Person>();
	}
	
	public void addOrder(Person person, OrderItem item)
	{
		persons.add(person);
	}
	
	public String getTab()
	{
		for (Person person : persons)
		{
			currentTab += person + "'s total is " + person.getTotal() + "/n";
		}
		return currentTab;
	}
}
