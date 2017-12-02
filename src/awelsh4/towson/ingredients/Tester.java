package awelsh4.towson.ingredients;
import java.util.*;


public class Tester {
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int amount;
		ArrayList<Ingredient> i = new ArrayList<Ingredient>();
		
		i.add(Chicken.getInstance());
		i.add(Lettuce.getInstance());
		i.add(Rice.getInstance());
		
		for (Ingredient ingredient: i)
		{	
			System.out.println("You have " + ingredient.getAmount() + " of " + ingredient.getName());
			System.out.println("How much of " + ingredient.getName() + " do you need? (Meat is measured in pieces, Everything else is in ounces)");
			
			amount = reader.nextInt();
			if ((double) amount > ingredient.getAmount())
			{
				
			}
			ingredient.sub(amount);
		}
		
		reader.close();
	}
}
