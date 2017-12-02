package awelsh4.towson.ingredients;

public class Lettuce implements Ingredient {
	private static int pieces = 50;
	private static Lettuce instance = new Lettuce();
	private String name = "Lettuce";
	
	private Lettuce()
	{
		
	}
	
	public static Lettuce getInstance()
	{
		if (pieces > 0)
		{
			return instance;
		}
		
		return null;
	}

	@Override
	public void sub(int amount) {
		pieces = pieces - amount;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	public String getAmount()
	{
		return "You have " + pieces + " pieces left of " + name;
	}
}
