package awelsh4.towson;

import java.util.ArrayList;

public class Observer {
	private ArrayList<Ingredient> observeThis = new ArrayList<Ingredient>();
	
	private static Observer instance = new Observer();
	
	private Observer()
	{
		
	}
	
	public static Observer getInstance()
	{
		return instance;
	}
	
	public String showIngredientAmount()
	{
		String status = "";
		for (Ingredient ingredient : observeThis)
		{
			status += ingredient.getName() + " has " + ingredient.getAmount() + " of its quantity left" + "\n";
		}
		
		return status;
	}
	
	public void subjects()
	{
		observeThis.add(Banana.getInstance());
		observeThis.add(Beef.getInstance());
		observeThis.add(Bread.getInstance());
		observeThis.add(Butter.getInstance());
		observeThis.add(Chicken.getInstance());
		observeThis.add(Cornmeal.getInstance());
		observeThis.add(Duck.getInstance());
		observeThis.add(Eggs.getInstance());
		observeThis.add(Flour.getInstance());
		observeThis.add(Goat.getInstance());
		observeThis.add(Lamb.getInstance());
		observeThis.add(Lettuce.getInstance());
		observeThis.add(Rice.getInstance());
		observeThis.add(Milk.getInstance());
		observeThis.add(Spinach.getInstance());
		observeThis.add(Sugar.getInstance());
		
	}
	
	
	
	
}
