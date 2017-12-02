package awelsh4.towson;

public class Bread implements Ingredients {
	private static int pieces = 50;
	private static Bread instance = new Bread();
	
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
}
