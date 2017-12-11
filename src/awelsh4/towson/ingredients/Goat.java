package awelsh4.towson.ingredients;

public class Goat implements Ingredient {
	private static int pieces = 200;
	private static Goat instance = new Goat();
	private String name = "Goat";
	
	private Goat()
	{
		
	}
	
	public static Goat getInstance()
	{
		if (pieces > 0)
			return instance;
		return null;
	}

	@Override
	public void sub(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAmount() {
		// TODO Auto-generated method stub
		return null;
	}

}
