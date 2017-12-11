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
	
	public void addPerson(Person person)
	{
		pir.add(person);
	}
	
	public Person findPerson (String name)
	{
		for (Person person : pir)
		{
			if(person.getName().trim().toLowerCase().equals(name.trim().toLowerCase()));
				return person;
		}
		return null;
	}
}
