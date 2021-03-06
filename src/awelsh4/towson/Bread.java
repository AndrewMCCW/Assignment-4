package awelsh4.towson;

public class Bread implements Ingredient {
	private static int pieces = 50;
	private static Bread instance = new Bread();
	private String name = "Bread";
	
	private Bread()
	{
		
	}
	
	public static Bread getInstance()
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
	
	@Override
	public String getAmount()
	{
		return "You have " + pieces + " pieces left of " + name;
	}
}
