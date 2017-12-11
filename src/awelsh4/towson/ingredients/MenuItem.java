package awelsh4.towson.ingredients;
import java.util.*;
import awelsh4.towson.*;

public class MenuItem implements Item {
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
		}
	}
	
	public void setInfo (String name, double price, String type)
	{
		this.desc = name; 
		this.price = price;
		this.type = type;
	}
	
	@Override
	public double getPrice()
	{
		return price;
	}
	
	@Override
	public String getType()
	{
		return type;
	}

	@Override
	public String getDesc() {
		return desc;
	}
	
	

}
