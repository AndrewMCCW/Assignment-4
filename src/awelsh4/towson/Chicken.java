package awelsh4.towson;

public class Chicken implements Ingredients {
	private static int pieces = 50;
	private static Chicken instance = new Chicken();
	
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
}
