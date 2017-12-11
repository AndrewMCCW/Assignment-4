package awelsh4.towson.ingredients;

public class Banana implements Ingredient {
	private static double pieces = 50.0;
	private static Banana instance = new Banana();
	private String name = "Banana";
	
	private Banana()
	{
		
	}
	
	public static Banana getInstance()
	{
		if(pieces > 0.0)
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
