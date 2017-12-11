package awelsh4.towson;
import java.util.*;

public class Tab {
	private ArrayList<Person> persons;
	private String currentTab;
	private double entireTab = 0.0;
	private String name = "Tab #";
	private int count = 1;
	
	Scanner reader = new Scanner(System.in);
	
	public Tab()
	{
		name += count;
		persons = new ArrayList<Person>();
		count++;
	}
	
	public void addPerson(Person person)
	{
		persons.add(person);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void getOrders ()
	{
		for (Person person : persons)
		{
			if (person.getOrderStatus() == false) 
			{
				System.out.println("(Waiter/Waitress) Would you like to order? ");
				if(reader.nextLine().toLowerCase().equals("Yes".toLowerCase()))
				{
					
					person.addOrder();
				}
			} else
			{
				System.out.println("(Waiter/Waitress) Would you like to order anything else? ");
			}
		}
	}
	
	public String getTab()
	{
		for (Person person : persons)
		{
			currentTab += person + "'s total is " + person.getTotal() + "/n";
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
