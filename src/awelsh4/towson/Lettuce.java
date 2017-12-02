package awelsh4.towson;

public class Lettuce implements Ingredients {
	private static int pieces = 50;
	private static Lettuce instance = new Lettuce();
	
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
}
