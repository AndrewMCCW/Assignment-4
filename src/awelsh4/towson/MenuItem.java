package awelsh4.towson;
import java.util.*;
import awelsh4.towson.*;

public class MenuItem {
	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	private String desc;
	private double price;
	private String type;
	
	public void addIngredient(Ingredient ingredient)
	{
		ingredients.add(ingredient);
	}
	
	public void showIngredients()
	{
		for (Ingredient ingredient : ingredients) 
		{
			System.out.println(ingredient.getName());
			System.out.println(ingredient.getAmount());
		}
	}
	
	public void takeAway()
	{
		for (Ingredient ingredient : ingredients)
		{
			ingredient.sub(1);
		}
	}
	
	public void setInfo (String name, double price, String type)
	{
		this.desc = name; 
		this.price = price;
		this.type = type;
	}
	
	
	public double getPrice()
	{
		return price;
	}
	
	
	public String getType()
	{
		return type;
	}

	public String getDesc() {
		return desc;
	}
	
	

}
