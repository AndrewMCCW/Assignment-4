package awelsh4.towson;
import java.util.*;
public class People {
	private ArrayList<Person> pir = new ArrayList<Person>(); //people in restaurant.
	
	private static People instance = new People();
	
	private People()
	{
		
	}
	
	public static People getInstance()
	{
		return instance;
	}
	
	public void addPerson(String name)
	{
		pir.add(new Person(name));
	}
	
	public Person findPerson (String name)
	{
		String compare;
		Person p;
		for (int i = 0; i < pir.size(); i++)
		{
			p = pir.get(i);
			compare = p.getName();
			if (compare.equals(name))
			{
				return p;
			}
		}
		return null;
	}
	
	public String getPeople()
	{
		String s = "";
		for (Person person : pir)
		{
			s += person.getName() + " is in the restaurant on " + person.getTab().getName() + "'s Tab" + "\n";
		}
		return s;
	}
}
