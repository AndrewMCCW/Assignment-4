package awelsh4.towson;
import java.util.*;

public class SystemInterface {

	private Invoker invoker = new Invoker();
	Scanner reader = new Scanner(System.in);
	
	public void getMenu() //*Works*
	{
		 invoker.displayMenu();
	}
	
	public void submitOrder() //*Works*
	{
		String order, name;
		System.out.println("(Waiter/Waitress) May I know who's ordering?");
		name = reader.nextLine().trim();
		System.out.println("(Waiter/Waitress) What would you like?");
		order = reader.nextLine().trim();
		invoker.submitOrder(name, order);
	}
	
	public void displayTab() //*Works*
	{
		int choice;
		String name;
		System.out.println("(Waiter/Waitress) Who would you like to check a personal tab or the entire table?");
		System.out.println("1 - Personal");
		System.out.println("2 - Entire Table");
		choice = reader.nextInt();
		reader.nextLine();
		if (choice == 1)
		{
			System.out.println("(Waiter/Waitress) Can I have your name, please?");
			name  = reader.nextLine();
			invoker.displayTab(name, true);
		} else 
		{
			System.out.println("(Waiter/Waitress) Can I have your tab's name, please?");
			name  = reader.nextLine();
			invoker.displayTab(name, false);
		}
		
		invoker.dispTabs();
		
	}
	
	public void addPerson(int party) //*Works*
	{
		String person_name;
		String host_name;
		int choice;
		
		if (party == 1) {
			System.out.println("(Waiter/Waitress) Would you like a new tab or is your party already here?");
			System.out.println("1 - Create New Tab");
			System.out.println("2 - Join Party");
			choice = reader.nextInt();
			reader.nextLine();
			
			if (choice == 1) {
				System.out.println("(Waiter/Waitress) Can I have a name, please?");
				person_name = reader.nextLine().trim();
				invoker.addPerson(person_name);
				invoker.addTab(person_name);
				invoker.connectTab(person_name);
				System.out.println();
				
			} else {
				System.out.println("(Waiter/Waitress) Can I have your name, please?");
				person_name = reader.nextLine();
				System.out.println("(Waiter/Waitress) Whose party would you like to join?");
				host_name = reader.nextLine();
				invoker.connectTab(person_name.trim(), host_name.trim());
				System.out.println("(Waiter/Waitress) Your party is expecting you, come with me");
			}	
		} else {
			System.out.println("(Waiter/Waitress) What is the name of your tab?");
			host_name = reader.nextLine();
			invoker.addTab(host_name);
			for (int i = 0; i < party; i++)
			{
				System.out.println("(Waiter/Waitress) Can I have a name, please?");
				person_name = reader.nextLine();
				invoker.addPerson(person_name);
				invoker.connectTab(person_name, host_name);
			}
		}
	}
	
	public void addPerson()
	{
		int choice;
		String person_name;
		String tab_name;
		int party;
		
		System.out.println("(Waiter/Waitress) Would you like a new tab or is your party already here?");
		System.out.println("1 - Create New Tab");
		System.out.println("2 - Join Party");
		choice = reader.nextInt();
		reader.nextLine();
		
		if (choice == 1) {
			System.out.println("(Waiter/Waitress) How Many?");
			party = reader.nextInt();
			reader.nextLine();
			
			System.out.println("(Waiter/Waitress) Name for the tab?");
			tab_name = reader.nextLine().trim();
			invoker.addTab(tab_name);
			
			for (int i = 1; i <= party; i++)
			{
				System.out.println("(Waiter/Waitress) Can I have a name, please?");
				person_name = reader.nextLine().trim();
				invoker.addPerson(person_name);
				invoker.connectTab(person_name, tab_name);
				System.out.println();
			}
			
		} else {
			System.out.println("(Waiter/Waitress) How many of you are joining?");
			party = reader.nextInt();
			reader.nextLine();
			
			System.out.println("(Waiter/Waitress) What is the name of the party you want to join?");
			tab_name = reader.nextLine().trim();
			
			for (int i = 1; i <= party; i++)
			{
				System.out.println("(Waiter/Waitress) Can I have your name, please?");
				person_name = reader.nextLine();
				invoker.connectTab(person_name, tab_name);
			}
			System.out.println("(Waiter/Waitress) Your party is expecting you, come with me");
		}	
	}
	
	public void displayPeople() //*Works*
	{
		invoker.dispPeople();
	}
	
	public void showIngredientStatus()
	{
		invoker.showIngredients();
	}
}
