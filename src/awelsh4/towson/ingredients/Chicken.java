package awelsh4.towson.ingredients;

public class Chicken implements Ingredient {
	private static int pieces = 50;
	private static Chicken instance = new Chicken();
	private String name = "Chicken";
	
	private Chicken()
	{
		
	}
	
	public static Chicken getInstance()
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
