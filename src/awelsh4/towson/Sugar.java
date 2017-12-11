package awelsh4.towson;

public class Sugar implements Ingredient {
	private static double cups = 200.0;
	private static Sugar instance = new Sugar();
	private String name = "Sugar";
	
	private Sugar()
	{
		
	}
	
	public static Sugar getInstance()
	{
		if (cups > 0)
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
