package awelsh4.towson;
import java.util.*;

public class MenuItem {
	private String name;
	private String type;
	private double price;
	private ArrayList<Ingredients> ingredients;
	
	public MenuItem(String name, String type, double price)
	{
		this.name = name;
		this.type = type;
		this.price = price;
		this.ingredients = new ArrayList<Ingredients>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public ArrayList addIngredients()
	{
		ingredients.add(Ingredients.getInstance());
		return this.ingredients;
	}
}
