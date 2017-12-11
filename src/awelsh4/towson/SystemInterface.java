package awelsh4.towson;
import java.util.*;

public class SystemInterface {

	private static Invoker invoker;
	Scanner reader = new Scanner(System.in);
	
	public static void initSystem()
	{
		invoker = new Invoker (new Aggregator());
	}
	
	public void getMenu()
	{
		invoker.displayMenu();
	}
	
	public void submitOrder()
	{
		invoker.submitOrder();
	}
	
	public void displayTab()
	{
		invoker.displayTab(tab);
	}
	
	public void enterRestaurant(int party)
	{
		Tab temp = new Tab();
		String s;
		Person p; 
		for (int i = 0; i < party; i++)
		{
			System.out.println("(Waiter/Waitress) May I have a name please: ");
			p = new Person();
			s = reader.nextLine();
			p.addName(s);
			temp.addPerson(p);
			People.getInstance().addPerson(p);
		}
		
	}
	
	public static void main (String [] args)
	{
		
	}
}
