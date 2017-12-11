package awelsh4.towson;

public class Eggs implements Ingredient {
	private static double pieces = 200;
	private static Eggs instance = new Eggs();
	private String name = "Eggs";
	
	private Eggs()
	{
		
	}
	
	public static Eggs getInstance()
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
