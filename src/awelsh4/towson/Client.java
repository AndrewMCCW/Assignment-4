package awelsh4.towson;

import java.util.Scanner;

public class Client {
	
	
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		SystemInterface s = new SystemInterface();
		String answer;
		int answer_;
		boolean exit = false;
		
		System.out.println("Would you like to enter the restaurant and get seated?");
		answer = reader.nextLine().trim();
		if (answer.toLowerCase().equals("Yes".trim().toLowerCase()))
		{
			System.out.println("(Waiter/Waitress) How many are in your party");
			answer_ = reader.nextInt();
			s.addPerson(answer_);
			
			
			while (exit == false) 
			{
				System.out.println("What would you like to do?");
				System.out.println("1 - Display Menu"); //*works*
				System.out.println("2 - Submit an Order ");
				System.out.println("3 - Display Tab ");
				System.out.println("4 - Look Who's in the Restaurant");
				System.out.println("5 - Add Random People");
				System.out.println("6 - Show Ingredients Status");
				 
				answer_ = reader.nextInt();
				
				switch (answer_)
				{
				case 1: s.getMenu(); //*works*
					break;
				case 2: s.submitOrder(); //*works*
					break;
				case 3: s.displayTab(); //*works*
					break;
				case 4: s.displayPeople(); //*works*
					break;
				case 5: s.addPerson();
					break;
				case 6: s.showIngredientStatus();
				}
			}
		} else {
		}
		
		
		
	}
}
